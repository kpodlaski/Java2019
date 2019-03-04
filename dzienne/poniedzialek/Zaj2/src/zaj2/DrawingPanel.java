package zaj2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 04.03.2019.
 */
public class DrawingPanel extends JPanel {

    private int x = 120;
    private int y = 120;
    private int w =10, h=10;

    Color[] colors = {Color.blue, Color.magenta, Color.cyan};
    int actualColor=0;
    private boolean clearPanel= false;

    @Override
    public void paint(Graphics g) {

        if (clearPanel) {
            super.paint(g);
            clearPanel=false;
        }
        else {
            g.setColor(colors[actualColor]);
            g.fillOval(x - w / 2, y - h / 2, w, h);
        }
    }

    public void moveBall(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    public void moveTo(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void nextColor(){
        actualColor=(actualColor+1)%colors.length;
    }

    public void clearPanel() {
        clearPanel=true;
        repaint();
    }
}
