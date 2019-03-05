package zaj3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 05.03.2019.
 */
public class MyDrawingPanel extends JPanel {

    private int x = 120;
    private int y = 70;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.cyan);
        g.fillOval(x,y,15,20);
    }

    public void moveBall(int dx, int dy){
        x+=dx;
        y+=dy;
    }
}
