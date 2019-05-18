package zaj5;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 11.05.2019.
 */
public class DrawingPanel extends javax.swing.JPanel {

    Image[] image;
    Image ballImage =  null;

    int x=75, y=128;
    int vx=1, vy=-2;
    int w=48, h=48;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(30,30,15,20);
        g.setColor(new Color(12,65,125));
        g.fillArc(100,25,40,40,0,60);
        g.setColor(Color.CYAN);
        g.fillOval(60,45,18,10);
        if (ballImage==null) loadImage();
        else g.drawImage(ballImage,x,y,w,h,null);
        Graphics2D g2 = (Graphics2D) g;

    }

    public void moveBall(int dx, int dy) {
        x+=dx;
        y+=dy;
    }

    public void accelerateBall(int dvx, int dvy) {
        vx+=dvx;
        vy+=dvy;
    }

    private void checkBoundaries() {
        if (x<=0 || x+w>=getWidth()){
            vx=-vx;
        }
        if(y<=0 || y+h>=getHeight()){
            vy=-vy;
        }
    }

    private void loadImage() {
        Runnable task  = new Runnable() {
            @Override
            public void run() {
                try {
                    image = new Image[3];
                    image[0]=ImageIO.read(
                            ClassLoader.getSystemResourceAsStream("zaj5/bilardBall.jpg"));
                            //new FileInputStream("c:\\.......")
                    image[1]=ImageIO.read(
                            ClassLoader.getSystemResourceAsStream("zaj5/bilardBall2.png"));
                    image[2]=ImageIO.read(
                            ClassLoader.getSystemResourceAsStream("zaj5/bilardBall3.png"));

                    ballImage = image[0];
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
            int i=0;
            int ballid=0;
            while(true){
                moveBall(vx,vy);
                checkBoundaries();
                repaint();
                if (i%10==0){
                    ballid=(ballid+1)%image.length;
                    ballImage= image[ballid];
                }
                i++;
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
