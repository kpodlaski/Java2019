package zaj8;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class Circle extends Figure {
    public double x, y, r;

    Circle(double x, double y, double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public void accept(Counter c) {
        c.visit(this);
    }

    @java.lang.Override
    public void draw(Graphics g) {
    }


}
