package zaj8;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public abstract class Figure {

    public void accept(Counter c) {
        c.visit(this);
    }

    abstract public void draw(Graphics g);
}
