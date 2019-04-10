package zaj5;

/**
 * Created by Krzysztof Podlaski on 03.04.2019.
 */
public class Counter implements Runnable {

    static int lastId =0;
    public static int x;
    private int id = lastId++;
    private static String monitor = new String("Monitor");

    private void  next(){
        synchronized (monitor) {
            x++;
            x++;
        }
    }
    @Override
    public void run() {
        for (int i=0; i<200; i++){
            next();
            if (x%20==0) 
                System.out.println(id+" x="+x);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] th = new Thread[2000];
        for(int i=0; i<th.length; i++){
            th[i] = new Thread(new Counter());
        }
        for(Thread t : th){
            t.start();
        }
        for(Thread t : th){
            t.join();
        }
        System.out.println(x);
    }
}
