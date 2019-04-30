package zaj8.figures;

import zaj8.Figure;
import zaj8.Measurer;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class Rectangle extends Figure {
    public double x,y,w,h;

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
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
