package zaj8;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class PerimeterCounter extends Counter {


    @Override
    public void visit(Circle c) {
        double o = 2*Math.PI*c.r;
        total+=o;
    }

    @Override
    public void visit(Rectangle r) {
        double o = 2*(r.w+r.h);
        total +=o;
    }

    @Override
    public void visit(Triangle triangle) {

    }
}
