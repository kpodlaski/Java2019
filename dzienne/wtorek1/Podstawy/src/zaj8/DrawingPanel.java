package zaj8;

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
        super.paint(g);
        for(Figure f : figures){
            f.draw(g);
        }
    }

    public double countOnFigures(CounterTypes type){
        Counter c = Counter.createCounter(type);
        for(Figure f : figures){
            f.accept(c);
        }
        return c.total;
    }

    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel();
        dp.figures.add(new Circle(120, 15, 30));
        dp.figures.add(new Circle(220, 155, 20));
        dp.figures.add(new Rectangle(70,35,20,13));
        //Pokazywanie na ekranie JPanelu
        //Zlicz pola
        double pole = dp.countOnFigures(CounterTypes.FieldCounter);
        System.out.println(pole);
        double obwod = dp.countOnFigures(CounterTypes.PerimeterCounter);
        System.out.println(obwod);
    }
}
