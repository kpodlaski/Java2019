package zaj8;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public abstract class Figure {
    public abstract void draw(Graphics g);

    public abstract void accept(Measurer m);
}
