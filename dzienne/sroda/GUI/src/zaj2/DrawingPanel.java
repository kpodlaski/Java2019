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
        super.paint(graphics);
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.magenta);
        g.fillOval(x,y,20,20);
    }

    public void moveBall(int dx, int dy) {
        x+=dx;
        y+=dy;
    }
}
