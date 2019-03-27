package zaj4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 27.03.2019.
 */
public class Listy {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volkswagen", "Golf", 1998));
        cars.add(new Car("Fiat", "Seicento", 2008));
        cars.add(new Car("Skoda", "Fabia", 2000));
        System.out.println(cars.size());
        System.out.println(cars);
        System.out.println(cars.get(1).getModel());
        Collections.sort(cars);
        Iterator<Car> it = cars.iterator();
        System.out.println("=========");
        while (it.hasNext()){
            Car c = it.next();
            System.out.println(c.getBrand());
        }
        for(Car c: cars){
            System.out.println(c.getBrand());
        }
    }
}
