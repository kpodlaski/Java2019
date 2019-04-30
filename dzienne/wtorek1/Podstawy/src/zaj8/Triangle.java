package zaj8;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class Triangle extends Figure {
    @Override
    public void accept(Counter c) {
        c.visit(this);
    }

    @Override
    public void draw(Graphics g) {

    }
}
