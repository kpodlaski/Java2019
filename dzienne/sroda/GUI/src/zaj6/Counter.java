package zaj6;

import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 10.04.2019.
 */
public class Counter {
    private char id;
    public Counter(char id){
        this.id = id;
    }

    private Random rand = new Random();

    public void serveClient(Client c) throws InterruptedException {
        System.out.println("Klient "+c + " podszedł do okienka "+id);
        //c.doSomething(this);
        Thread.sleep(30 + rand.nextInt(50) );
        System.out.println("Klient "+c + " odchodzi od okienka "+id);
    }
}
