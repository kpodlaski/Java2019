package zaj8;

import zaj8.figures.Circle;
import zaj8.figures.Rectangle;
import zaj8.measurers.FieldMeasurer;
import zaj8.measurers.PerimeterMeasurer;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public abstract class Measurer {
    public double total;

    public static Measurer createInstance(MeasurerType type) {
        Measurer m = null;
        switch (type){
            case FieldMeasurer : m = new FieldMeasurer();break;
            case PerimeterMeasurer: m= new PerimeterMeasurer(); break;
        }
        return m;
    }

    public abstract void visit(Circle circle);

    public abstract void visit(Rectangle rectangle);
}

enum MeasurerType{
    FieldMeasurer,
    PerimeterMeasurer
}
