package zaj5;

/**
 * Created by Krzysztof Podlaski on 03.04.2019.
 */
public class Counter2 implements Runnable{

    public int x;

    public synchronized int getX(){
        return x;
    }

    private synchronized void  next(){
            x++;
            x++;
    }


    @Override
    public void run() {
        while(true){
            next();
        }
    }

    public static void main(String[] args) {
        Counter2 counter = new Counter2();
        Tester tester = new Tester(counter);
        Thread t = new Thread(tester);
        t.start();
        t = new Thread(counter);
        t.start();
    }
}

class Tester implements Runnable{
    private Counter2 counter;

    public Tester(Counter2 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        int v;
        while(true){
            v=counter.getX();
            if (v%2==1){
                System.out.println(v+"  "+counter.getX());
                throw new RuntimeException("Odd number");
            }
        }
    }
}
