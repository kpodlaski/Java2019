package zaj4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Krzysztof Podlaski on 26.03.2019.
 */
public class Zbiory {
    public static void main(String[] args) {
        Set<Car> samochody = new HashSet<>();
        samochody.add(new Car("Daewoo","Matiz",2001));
        samochody.add(new Car("Fiat","Panda",2011));
        samochody.add(new Car("Volkswagen","Passat",1998));
        System.out.println(samochody.size());
        System.out.println(samochody);
        for(Car c:samochody){
            System.out.println(c +" \t" +c.hashCode());
        }
        Car c = new Car("Volkswagen","passat",1998);
        samochody.add(c);
        System.out.println(samochody);
        samochody.add(c);
        System.out.println(samochody);
    }
}
