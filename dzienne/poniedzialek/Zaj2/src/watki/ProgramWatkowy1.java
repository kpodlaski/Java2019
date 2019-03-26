package watki;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 25.03.2019.
 */
public class ProgramWatkowy1 {
    public static void main(String[] args) {
        List<Zliczacz> zl =new ArrayList<>();
        zl.add(new Zliczacz("A"));
        zl.add(new Zliczacz("B"));
        for(Zliczacz z : zl){
            Thread th = new Thread(z);
            th.start();
        }
        System.out.println("KONIEC PROGRAMU");
    }
}
