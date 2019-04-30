package zaj8.figures;

import zaj8.Figure;
import zaj8.Measurer;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class Circle extends Figure {
    public double x,y,r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    @Override
    public void draw(Graphics g) {
        //TODO
    }
    @Override
    public void accept(Measurer m) {
        m.visit(this);
    }
}
