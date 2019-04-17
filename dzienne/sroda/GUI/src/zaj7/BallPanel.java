package zaj7;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 17.04.2019.
 */
public class BallPanel extends JPanel {
    Ball ball;
    Animation animation;

    public BallPanel(Ball ball) {
        this.ball=ball;
        this.animation = new Animation();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        ball.draw(g);
    }

    private void checkColissions() {
        //TODO
    }

    private void updateState() {
        ball.move();
    }

    public void startAnimation(){
        Thread t = new Thread(animation);
        t.start();
    }

    public void stopAnimation(){
        animation.animationStop=true;
    }


    class Animation implements Runnable{

        private boolean animationStop = false;

        @Override
        public void run() {
            while(!animationStop){
                updateState();
                checkColissions();
                repaint();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Ball ball = Ball.create("zaj7/8ball.gif",
                50,50,20);
        BallPanel bPanel = new BallPanel(ball);
        JFrame frame = new JFrame("Kulki");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(bPanel);
        frame.setSize(500,500);
        frame.setVisible(true);
        bPanel.startAnimation();
    }



}
