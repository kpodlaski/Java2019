package zaj6;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 10.04.2019.
 */
public class PostOffice {
    private List<Counter> countersAvailable = new ArrayList<>();

    public PostOffice(){
        countersAvailable.add(new Counter('A'));
        countersAvailable.add(new Counter('C'));
        countersAvailable.add(new Counter('B'));
    }

    public synchronized Counter reserveCounter(){
        if (countersAvailable.size()==0) return null;
        Iterator<Counter> it = countersAvailable.iterator();
        Counter c = it.next();
        it.remove();
        return c;
    }

    public synchronized void makeCounterAvailable(Counter c){
        countersAvailable.add(c);
    }
}
