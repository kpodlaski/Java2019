package zaj3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 11.05.2019.
 */
public class DrawingPanel extends JPanel {

    Image ball = null;
    private int x=60,y=80;
    private void loadImage(){
        try {
            ball = ImageIO.read(
            ClassLoader.getSystemResourceAsStream("zaj3/mikasa.lpg")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        //new FileInputStream("C:\\......");
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.magenta);
        g.fillOval(20,40,15,30);
        g.drawRect(120,115,18,35);
        if (ball==null) loadImage();
        g.drawImage(ball,x,y,60,60,null);
    }

    public void moveBall(int dx, int dy){
        x+=dx;
        y+=dy;
        repaint();
    }
}
