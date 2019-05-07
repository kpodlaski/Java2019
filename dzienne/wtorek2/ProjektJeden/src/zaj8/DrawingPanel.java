package zaj8;

import zaj8.figures.Circle;
import zaj8.figures.Rectangle;
import zaj8.figures.Triangle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 30.04.2019.
 */
public class DrawingPanel extends JPanel {
    List<Figure> figures = new ArrayList<>();

    @Override
    public void paint(Graphics g){
        for(Figure f : figures){
            f.draw(g);
        }
    }

    public double mesaure(MeasurerType type){
        Measurer m = Measurer.createInstance(type);
        for(Figure f : figures){
            f.accept(m);
        }
        return m.total;
    }

    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel();
        dp.figures.add(new Circle(234,132,15));
        dp.figures.add(new Circle(14,75,21));
        dp.figures.add(new Rectangle(33,271,12,15));
        dp.figures.add(new Triangle(
                22,25,
                32,25,
                12,12));
        //TODO Drawimg and GUI
        double f = dp.mesaure(MeasurerType.FieldMeasurer);
        System.out.println(f);
        double p = dp.mesaure(MeasurerType.PerimeterMeasurer);
        System.out.println(p);
    }
}
