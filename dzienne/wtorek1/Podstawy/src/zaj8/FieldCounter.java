package zaj8;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class FieldCounter extends Counter {


    @Override
    public void visit(Circle c) {
        double f = c.r*c.r*Math.PI;
        total+=f;
    }

    @Override
    public void visit(Rectangle r) {
        double f = r.w*r.h;
        total+=f;
    }

    @Override
    public void visit(Triangle triangle) {

    }
}
