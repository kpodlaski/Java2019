package zaj4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Krzysztof Podlaski on 26.03.2019.
 */
public class Zbiory {

    public static void main(String[] args) {
        Set<Author> autorzy = new HashSet<>();
        autorzy.add(new Author("Bolesław","Prus"));
        autorzy.add(new Author("Bolesław","Leśmian"));
        autorzy.add(new Author("Agatha","Christie"));
        System.out.println(autorzy.size());
        Author a = new Author("Eliza", "Orzeszkowa");
        autorzy.add(a);
        System.out.println(autorzy);
        autorzy.add(a);
        System.out.println(autorzy);
        autorzy.add(new Author("Eliza", "Orzeszkowa"));
        System.out.println(autorzy);
        System.out.println(a.hashCode());
    }
}
