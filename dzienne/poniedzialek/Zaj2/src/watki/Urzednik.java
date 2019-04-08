package watki;

import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 08.04.2019.
 */
public class Urzednik {
    private int id;

    public Urzednik(int id) {
        this.id = id;
    }

    public String toString(){
        return "o"+id;
    }
    private Random rand = new Random();
    public void obslugaKlienta(Klient k){
        System.out.println("Klient "+k+
        " podszedl do okienka "+this);
        try {
            Thread.sleep(rand.nextInt(50)+30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Klient "+k+
                " odchodzi od okienka "+this);
    }
}
