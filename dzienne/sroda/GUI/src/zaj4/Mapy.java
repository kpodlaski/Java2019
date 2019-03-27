package zaj4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Krzysztof Podlaski on 27.03.2019.
 */
public class Mapy {
    public static void main(String[] args) {
        Map<String, List<Car>> ownCars = new HashMap<>();
        List<Car> c = new ArrayList<>();
        c.add(new Car("Volkswagen", "Golf", 1998));
        ownCars.put("Jan Kowalski",c);
        c = new ArrayList<>();
        c.add(new Car("Skoda", "Felicia", 2005));
        ownCars.put("Janina Kowalska",c);
        System.out.println(ownCars);
        System.out.println(ownCars.get("Janina Kowalska"));
        ownCars.get("Janina Kowalska").add(
                new Car("Skoda", "Superb", 2019));
        for(String owner : ownCars.keySet()){
            System.out.println(
                    owner +" => "+ownCars.get(owner));
        }
    }
}
