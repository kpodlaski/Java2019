package watki;

/**
 * Created by Krzysztof Podlaski on 25.03.2019.
 */
public class Zliczacz implements Runnable {
    private String nazwa;

    public Zliczacz(String nazwa) {
        this.nazwa = nazwa;
    }

    public void  run(){
        int i=1;
        while(i<100){
            System.out.println(nazwa + " "+i);
            i++;
        }

    }


}
