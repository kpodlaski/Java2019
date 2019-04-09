package zaj6;

import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 09.04.2019.
 */
public class Officer {
    private char id;
    private Random rand;
    public Officer(char id){this.id=id;}
    public void serveClient(Client c){
        try {
            System.out.println
              ("Klient " + c + " podszedł do okienka " + this);
            int time = rand.nextInt(50);
            Thread.sleep(time + 30);
            System.out.println
               ("Klient " + c + " odszedł od okienka " + this);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public String toString(){
        return ""+id;
    }

}
