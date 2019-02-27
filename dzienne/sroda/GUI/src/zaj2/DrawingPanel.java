package zaj2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 27.02.2019.
 */
public class DrawingPanel extends JPanel {
    private int x=100;
    private int y=100;


    @Override
    public void paint(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        //g.setColor(Color.WHITE);
        //g.fillRect(0,0,this.getWidth(),this.getHeight());
        g.setColor(Color.magenta);
        g.fillOval(x-10,y-10,20,20);
    }

    public void moveBall(int dx, int dy) {
        x+=dx;
        y+=dy;
    }

    public void moveBallTo(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
