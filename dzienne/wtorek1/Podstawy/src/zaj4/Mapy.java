package zaj4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Krzysztof Podlaski on 26.03.2019.
 */
public class Mapy {

    public static void main(String[] args) {
        Map<String, Author> biblioteka = new HashMap<>();
        biblioteka.put(
                "Lalka",
                new Author("Bolesław","Prus")
        );
        biblioteka.put(
                "Antek",
                new Author("Bolesław","Prus")
        );
        System.out.println(biblioteka);
        System.out.println(biblioteka.get("Antek"));
        for(String book : biblioteka.keySet()){
            System.out.println(book+"\t"+biblioteka.get(book));
        }
    }
}
