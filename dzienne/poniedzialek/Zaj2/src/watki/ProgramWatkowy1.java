package watki;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 25.03.2019.
 */
public class ProgramWatkowy1 {
    public static void main(String[] args) throws InterruptedException {
        List<Zliczacz> zl =new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for (int i=0; i<1000; i++) {
            zl.add(new Zliczacz("W" + i));
        }
        for(Zliczacz z : zl){
            Thread th = new Thread(z);
            threads.add(th);
            th.start();
        }
        for(Thread t : threads){
            t.join();
        }
        System.out.println("KONIEC PROGRAMU");
        System.out.println(Zliczacz.wartosc);
    }
}
