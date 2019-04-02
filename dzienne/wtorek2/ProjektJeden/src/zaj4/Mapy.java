package zaj4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Krzysztof Podlaski on 02.04.2019.
 */
public class Mapy {

    public static void main(String[] args) {
        Map<String,List<Car>> pojazdy = new HashMap<>();
        List<Car> l = new ArrayList<>();
        l.add(new Car("Fiat","Panda",2010));
        pojazdy.put("Jan Kowalski", l );
        l = new ArrayList<>();
        l.add(new Car("Skoda","Oktavia",2016));
        pojazdy.put("Janina Kowalski",l);
        l = new ArrayList<>();
        l.add(new Car("Volksvagen","Golf",2000));
        pojazdy.put("Izabela Kania",l);
        System.out.println(pojazdy);
        pojazdy.get("Jan Kowalski")
                .add(new Car("Audi","Q4",2017));
        for(String osoba : pojazdy.keySet()){
            System.out.print(osoba +" => ");
            for (Car c : pojazdy.get(osoba)){
                System.out.print(c.getModel()+ " ");
            }
            System.out.println();
        }
    }
}
