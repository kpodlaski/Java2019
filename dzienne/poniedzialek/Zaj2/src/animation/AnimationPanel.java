package animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 08.04.2019.
 */
public class AnimationPanel extends JPanel{
    //private double x, y, vx, vy;
    private List<Ball> balls = new ArrayList<>();
    private Animation animation;

    public AnimationPanel(){
        Ball b = new Ball(140, 60, -2, 2);
        b.color=Color.cyan;
        balls.add(b);
        b = new Ball(60, 60, 2, 2);
        balls.add(b);
        b = new Ball(240, 240, 2, 2);
        b.color=Color.yellow;
        balls.add(b);
        b.color=Color.red;
        b = new Ball(200, 200, 4, 4);
        balls.add(b);
        //x=100;
        //y=100;
        //vx=2;
        //vy=-2;
        animation = new Animation();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(Ball b : balls){
            b.drawBall(g);
        }
        balls.get(0).drawInfo(g);
    }

    public void start(){
        Thread t =  new Thread(animation);
        t.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animacja");
        AnimationPanel aPanel = new AnimationPanel();
        frame.setContentPane(aPanel);
        frame.addKeyListener(aPanel.new PanelKeyListener());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aPanel.setSize(600,600);
        frame.setSize(600,600);

        //frame.pack();
        frame.setVisible(true);
        aPanel.start();
    }

    class Animation implements Runnable{

        @Override
        public void run() {
            while(true) {
                moveBall();
                checkBoundaries();
                checkBallCollisions();
                repaint();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void checkBoundaries() {
            for(Ball b : balls){
                b.checkBoundaries(getWidth(), getHeight());
            }
        }

        private void moveBall() {
            for(Ball b : balls){
                b.moveBall();
            }
        }
    }

    private void checkBallCollisions() {
        for (int i =0; i< balls.size(); i++){
            for (int j = i+1; j< balls.size(); j++){
                Ball bI = balls.get(i);
                Ball bJ = balls.get(j);
                bI.checkColisionWith(bJ);
            }
        }
    }

    private class PanelKeyListener
            extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            System.out.println("Key Pressed");
            switch(e.getKeyCode()){
                case KeyEvent.VK_W : balls.get(0).increaseV(0,-1);break;
                case KeyEvent.VK_S : balls.get(0).increaseV(0,1);break;
                case KeyEvent.VK_A : balls.get(0).increaseV(-1,0);break;
                case KeyEvent.VK_D : balls.get(0).increaseV(+1,0);break;
            }
        }
    }
}
