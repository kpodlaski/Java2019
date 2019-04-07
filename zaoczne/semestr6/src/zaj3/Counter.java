package zaj3;

/**
 * Created by Krzysztof Podlaski on 07.04.2019.
 */
public class Counter implements Runnable{
    static int counter;
    private int id;
    public Counter(int id){this.id=id;}
    @java.lang.Override
    public void run() {
        for (int i=0; i<100; i++){
            next();
            if (counter%10==0) {
                System.out.println("w" + id + " " + counter);
            }
        }
    }
    /*rozwiwiązanie A
    private static synchronized void next() {
            counter++;

    }
    */
    //rozwiązanie B
    static Object kontrolerSynchronizacji = new Object();
    private void next() {
        synchronized (kontrolerSynchronizacji){
            counter++;
        }

    }
    public static void main(String[] args) throws InterruptedException {
        Counter[] c = new Counter[5000];
        Thread[] t = new Thread[c.length];
        for (int i=0; i<c.length; i++){
            c[i] = new Counter(i);
            t[i] = new Thread(c[i]);
            t[i].start();
            //t[i].join();
        }
        for (int i=0; i<c.length; i++){
            t[i].join();
        }
        System.out.println("Koniec programu");
        System.out.println("ostatecnie dla w1 "+c[1].counter);
        System.out.println("ostatecnie dla w2 "+c[2].counter);
    }
}
