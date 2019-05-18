package zaj4;

import java.io.IOException;

public class Counter {

    private int value;

    public int getValue(){
        return value;
    }

    //podejscie synchronizacji nr.3 identyczne z nr.2 this kontroluje synchronizację
    public synchronized void increase(){
        //podejscie synchronizacji nr.2
        //synchronized (this) {
            value++;
        //}
    }

    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();
        for(int i=0; i<80; i++){
            Thread t = new Thread(new CounterTask(counter));
            t.start();
        }
        int s = System.in.read();
        System.out.println(counter.getValue());
    }
}

class CounterTask implements Runnable{
    Counter counter;

    public CounterTask(Counter c){
        this.counter=c;
    }
    @Override
    public void run() {
        for (int i =0; i<100; i++){
            //podejscie synchronizacji nr.1
            //synchronized (counter) {
                counter.increase();
            //}
        }
        System.out.println("Koniec Watku przy wartości: "+counter.getValue());
    }
}