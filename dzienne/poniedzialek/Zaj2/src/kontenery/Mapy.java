package kontenery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Krzysztof Podlaski on 25.03.2019.
 */
public class Mapy {
    public static void main(String[] args) {
        Map<String,List<Author>> biblioteka = new HashMap<>();
        ArrayList<Author> a = new ArrayList<>();
        a.add(new Author("Bolesław", "Prus"));
        biblioteka.put("Lalka",a);
        a = new ArrayList<>();
        a.add(new Author("James","Joyce"));
        biblioteka.put("Ulisses",a);
        a = new ArrayList<>();
        a.add(new Author("Paul","Dietel"));
        biblioteka.put("Java How to Program, Early Objects",a);
        System.out.println(biblioteka);
        biblioteka.get("Java How to Program, Early Objects")
                .add(new Author("Harvey","Dietel")
                );
        System.out.println(biblioteka);
    }
}
