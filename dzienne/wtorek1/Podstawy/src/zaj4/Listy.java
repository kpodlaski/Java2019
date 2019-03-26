package zaj4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 26.03.2019.
 */
public class Listy {

    public static void main(String[] args) {
        List<Author> autorzy = new ArrayList<>();
        autorzy.add(new Author("Bolesław","Prus"));
        autorzy.add(new Author("Bolesław","Leśmian"));
        autorzy.add(new Author("Agatha","Christie"));
        System.out.println(autorzy.size());
        System.out.println(autorzy.get(2).getSurname());
        Collections.sort(autorzy);
        Iterator<Author> it = autorzy.iterator();
        while (it.hasNext()){
            Author a = it.next();
            System.out.println(a.getSurname());
        }
        System.out.println("========");
        for (int i=0; i<autorzy.size(); i++){
            System.out.println(autorzy.get(i).getSurname());
        }
        System.out.println("========");
        for (Author au : autorzy){
            System.out.println(au.getSurname());
        }

    }
}
