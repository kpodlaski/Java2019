package zaj8;



/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public abstract class Counter {
    public double total = 0.0;

    abstract public void visit(Figure figure);

    abstract public void visit(Circle c);
    abstract public void visit (Rectangle r);

    public static Counter createCounter(CounterTypes type) {
        switch (type){
            case FieldCounter: return new FieldCounter();
            case PerimeterCounter: return new PerimeterCounter();
            default: return new FieldCounter();
        }

    }
}

enum CounterTypes{
    FieldCounter,
    PerimeterCounter
}