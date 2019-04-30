package zaj8.measurers;

import zaj8.Measurer;
import zaj8.figures.Circle;
import zaj8.figures.Rectangle;

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
}
