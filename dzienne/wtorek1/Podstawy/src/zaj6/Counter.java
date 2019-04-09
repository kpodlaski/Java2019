package zaj6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 09.04.2019.
 */
public class Counter implements Runnable {

    private static int value;
    private static Object synchMonitor = new Object();
    private int id;

    public Counter(int id){
        this.id=id;
    }

    public static synchronized void next(){
        value++;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            /*synchronized (synchMonitor) {
                value++;
            }
            */
            next();
            if (value%50==0){
                System.out.println("w"+id+" -- "+value);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        List<Counter> counters = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for (int i=0; i< 50; i++){
            Counter c = new Counter(i+1);
            counters.add(c);
            Thread t = new Thread(c);
            threads.add( t );
            t.start();
            //t.join(); brak równoległości
        }
        for(Thread t : threads){
            t.join();
        }
        System.out.println(Counter.value);
        System.out.println("END OF THE PROGRAM");
    }
}
