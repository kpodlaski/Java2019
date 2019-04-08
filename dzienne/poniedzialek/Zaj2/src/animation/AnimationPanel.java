package animation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 08.04.2019.
 */
public class AnimationPanel extends JPanel{
    private double x, y, vx, vy;
    private Animation animation;

    public AnimationPanel(){
        x=100;
        y=100;
        vx=2;
        vy=-2;
        animation = new Animation();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawOval((int) x-5, (int) y-5,10,10);
    }

    public void start(){
        Thread t =  new Thread(animation);
        t.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animacja");
        AnimationPanel aPanel = new AnimationPanel();
        frame.setContentPane(aPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.pack();
        frame.setVisible(true);
        aPanel.start();
    }

    class Animation implements Runnable{

        @Override
        public void run() {
            moveBall();
            checkBoundaries();
            repaint();
        }

        private void checkBoundaries() {
            if ( x-5<=0 || x+5>=getWidth()){
                vx=-vx;
            }
            if ( y-5<=0 || y+5>=getHeight()){
                vy=-vy;
            }
        }

        private void moveBall() {
            x+=vx;
            y+=vy;
        }
    }
}
