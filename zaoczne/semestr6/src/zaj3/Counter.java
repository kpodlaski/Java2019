package zaj3;

/**
 * Created by Krzysztof Podlaski on 07.04.2019.
 */
public class Counter implements Runnable{
    int counter;
    private int id;
    public Counter(int id){this.id=id;}
    @java.lang.Override
    public void run() {
        for (int i=0; i<100; i++){
            next();
            if (i%10==0) System.out.println("w"+id+" "+counter);
        }
    }
    private void next() {
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter(1);
        Counter c2 = new Counter(2);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Koniec programu");
        System.out.println("ostatecnie dla w1 "+c1.counter);
        System.out.println("ostatecnie dla w1 "+c2.counter);
    }
}
