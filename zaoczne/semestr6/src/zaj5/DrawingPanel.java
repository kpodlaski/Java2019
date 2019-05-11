package zaj5;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 11.05.2019.
 */
public class DrawingPanel extends javax.swing.JPanel {

    Image ballImage =  null;
    int x=75, y=128;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(30,30,15,20);
        g.setColor(new Color(12,65,125));
        g.fillArc(100,25,40,40,0,60);
        g.setColor(Color.CYAN);
        g.fillOval(60,45,18,10);
        if (ballImage==null) loadImage();
        else g.drawImage(ballImage,x,y,48,48,null);
    }

    public void moveBall(int dx, int dy) {
        x+=dx;
        y+=dy;
    }

    private void loadImage() {
        Runnable task  = new Runnable() {
            @Override
            public void run() {
                try {
                    ballImage = ImageIO.read(
                            ClassLoader.getSystemResourceAsStream("zaj5/bilardBall.jpg")
                            //new FileInputStream("c:\\.......")
                    );
                } catch (IOException e) {
                    e.printStackTrace();
                }
                repaint();
                new Thread(new Animation()).start();
            }
        };
        new Thread(task).start();

    }

    class Animation implements Runnable{

        @Override
        public void run() {
            while(true){
                moveBall(1,-2);
                repaint();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
