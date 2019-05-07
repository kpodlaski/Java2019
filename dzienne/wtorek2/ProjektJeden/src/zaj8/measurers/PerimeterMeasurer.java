package zaj8.measurers;

import zaj8.Measurer;
import zaj8.figures.Circle;
import zaj8.figures.Rectangle;
import zaj8.figures.Triangle;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class PerimeterMeasurer extends Measurer{
    @Override
    public void visit(Circle circle) {
        double o = 2*Math.PI*circle.r;
        total+=o;
    }

    @Override
    public void visit(Rectangle rectangle) {
        double o = 2* (rectangle.w+rectangle.h);
        total+=o;
    }

    @Override
    public void visit(Triangle t) {
        double d = Math.pow(t.x1-t.x2,2);
        d+=Math.pow(t.y1-t.y2,2);
        total += Math.sqrt(d);
        d = Math.pow(t.x2-t.x3,2);
        d+=Math.pow(t.y3-t.y3,2);
        total += Math.sqrt(d);
        d = Math.pow(t.x3-t.x1,2);
        d+=Math.pow(t.y3-t.y1,2);
        total += Math.sqrt(d);
    }
}
