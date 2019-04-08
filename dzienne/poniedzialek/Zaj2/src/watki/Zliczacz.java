package watki;

/**
 * Created by Krzysztof Podlaski on 25.03.2019.
 */
public class Zliczacz implements Runnable {
    private String nazwa;
    public static int wartosc=0;
    public static Object monitoSynchronizacji = new Object();

    public Zliczacz(String nazwa) {
        this.nazwa = nazwa;
    }

    static synchronized void  next(){
        wartosc++;
    }
    public void  run(){
        int i=0;
        while(i<100){
            System.out.println(nazwa + " "+wartosc);
            i++;
            next();
            /*
            synchronized (monitoSynchronizacji) {
                wartosc++;
            }
            */
        }

    }


}
