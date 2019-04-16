package zaj7;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 16.04.2019.
 */
public class BallPanel extends JPanel {
    Ball ball;
    Animation animation;

    public BallPanel(Ball ball){
        this.ball=ball;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(ball.image,ball.x, ball.y,
                ball.size, ball.size, Color.pink,
                null);
    }

    private void checkColisions() {
        ball.colisionsWithBorders(getWidth(),getHeight());
    }

    public void startAnimation(){
        animation = new Animation();
        Thread t = new Thread(animation);
        t.start();
    }

    public void stopAnimation(){
        animation.end_amination=true;
    }
    class Animation implements Runnable{

        private boolean end_amination = false;

        @Override
        public void run() {
            while(!end_amination){
                ball.move();
                checkColisions();
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
        Ball ball = Ball.create("zaj7/ball.png",20,20);
        BallPanel bPanel = new BallPanel(ball);
        JFrame frame = new JFrame("BallPanel");
        frame.setContentPane(bPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bPanel.setSize(550,550);
        frame.setSize(600,600);
        frame.setVisible(true);
        bPanel.startAnimation();
    }
}
