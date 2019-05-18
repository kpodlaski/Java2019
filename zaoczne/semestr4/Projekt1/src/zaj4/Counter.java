package zaj4;

public class Counter {

    private int value;

    public int getValue(){
        return value;
    }

    public void increase(){
        value++;
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
            counter.increase();
        }
    }
}