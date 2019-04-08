package watki;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Krzysztof Podlaski on 08.04.2019.
 */
public class Urząd {
    Set<Urzednik> okienka = new HashSet<>();

    synchronized Urzednik wolneOkienko(){
        if (okienka.size()==0) return null;
        Iterator<Urzednik> it = okienka.iterator();
        return it.next();
    }

    synchronized void zwolnionoOkienko(Urzednik u){
        okienka.add(u);
    }

    public Urząd(){
        okienka.add(new Urzednik(1));
        okienka.add(new Urzednik(2));
        okienka.add(new Urzednik(3));
    }

    public static void main(String[] args) {
        Urząd u = new Urząd();
        //ArrayList<Thread> threads = new ArrayList<>();
        for (int i=0; i<15; i++){
            Thread t = new Thread(new Klient(i,u));
            t.start();
            //threads.add(t);
        }
    }
}
