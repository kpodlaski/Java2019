package zaj8;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class DrawingPanel extends JPanel {
    List<Figure> figures;

    @Override
    public void paint(Graphics g){
        super.paint(g);
        for(Figure f : figures){
            f.draw(g);
        }
    }

    public double countOnFigures(CounterTypes type){
        Counter c = Counter.createCounter(type);
        for(Figure f : figures){
            f.accept(c);
        }
        return c.total;
    }

}
