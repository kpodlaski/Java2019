package zaj3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 05.03.2019.
 */
public class MyDrawingPanel extends JPanel {
    private int x = 200;
    private int y = 156;
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.setColor(Color.orange);
        g.fillOval(x-12,y-9,24,18);
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
