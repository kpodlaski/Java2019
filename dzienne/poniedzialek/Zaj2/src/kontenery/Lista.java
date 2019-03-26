package kontenery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 25.03.2019.
 */
public class Lista {

    public static void main(String[] args) {
        List<Author> autorzy = new ArrayList<>();
        autorzy.add(new Author("Eliza", "Orzeszkowa"));
        autorzy.add(new Author("Bolesław", "Prus"));
        autorzy.add(new Author("James", "Joyce"));
        Collections.sort(autorzy);
        Iterator<Author> it = autorzy.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(autorzy.get(2).getSurname());

    }
}
