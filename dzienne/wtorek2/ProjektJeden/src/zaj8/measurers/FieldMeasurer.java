package zaj8.measurers;

import zaj8.Measurer;
import zaj8.figures.Circle;
import zaj8.figures.Rectangle;
import zaj8.figures.Triangle;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class FieldMeasurer extends Measurer{
    @Override
    public void visit(Circle circle) {
        double f = Math.PI*circle.r*circle.r;
        total+=f;
    }

    @Override
    public void visit(Rectangle rectangle) {
        double f = rectangle.w*rectangle.h;
        total+=f;
    }

    @Override
    public void visit(Triangle triangle) {
        double f = 0; //TODO BETTER
        total+=f;
    }
}
