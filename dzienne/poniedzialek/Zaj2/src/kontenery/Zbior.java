package kontenery;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Krzysztof Podlaski on 25.03.2019.
 */
public class Zbior {
    public static void main(String[] args) {
        Set<Author> sAutorzy = new HashSet<>();
        sAutorzy.add(new Author("Eliza", "Orzeszkowa"));
        sAutorzy.add(new Author("Bolesław", "Prus"));
        Author author = new Author("James", "Joyce");
        sAutorzy.add(new Author("ELIZA", "Orzeszkowa"));
        sAutorzy.add(author);
        sAutorzy.add(author);
        sAutorzy.add(new Author("James", "Joyce"));
        Iterator<Author> it = sAutorzy.iterator();
        for(Author a : sAutorzy){
            System.out.println(a);
        }
    }
}
