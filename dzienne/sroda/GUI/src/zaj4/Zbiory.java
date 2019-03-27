package zaj4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Krzysztof Podlaski on 27.03.2019.
 */
public class Zbiory {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Volkswagen", "Golf", 1998));
        cars.add(new Car("Fiat", "Seicento", 2008));
        cars.add(new Car("Skoda", "Fabia", 2000));
        System.out.println(cars.size());
        System.out.println(cars);
        Car c = new Car("VOLKSWAGEN", "GOLF", 1998);
        cars.add(c);
        cars.add(c);
        Iterator<Car> it = cars.iterator();
        while(it.hasNext()){
            Car cc = it.next();
            System.out.println(cc.getBrand()+"\t"+cc.hashCode()+"--");
        }
    }
}
