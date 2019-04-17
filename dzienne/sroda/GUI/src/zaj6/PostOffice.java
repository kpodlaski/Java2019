package zaj6;


import java.util.*;

/**
 * Created by Krzysztof Podlaski on 10.04.2019.
 */
public class PostOffice {
    private List<Counter> countersAvailable = new ArrayList<>();
    private Deque<Client> deque = new ArrayDeque<>();
    public PostOffice(){
        countersAvailable.add(new Counter('A'));
        countersAvailable.add(new Counter('C'));
        countersAvailable.add(new Counter('B'));
    }

    public synchronized Counter reserveCounter(Client client){
        if (countersAvailable.size()==0) {
            if (!deque.contains(client)){
                deque.addLast(client);
            }
            return null;
        }
        if (deque.contains(client)) deque.remove(client);
        Iterator<Counter> it = countersAvailable.iterator();
        Counter c = it.next();
        it.remove();
        return c;
    }

    public synchronized void makeCounterAvailable(Counter c){
        countersAvailable.add(c);
        Client next = deque.getFirst();
        next.wakeUp();
    }
}
