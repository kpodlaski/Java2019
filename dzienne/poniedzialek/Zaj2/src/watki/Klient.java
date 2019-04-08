package watki;

/**
 * Created by Krzysztof Podlaski on 08.04.2019.
 */
public class Klient implements Runnable{
    private int id;
    private Urząd urzad;

    public Klient(int id, Urząd u) {
        this.id = id;
        urzad = u;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }

    @Override
    public void run() {
        try {
            System.out.println("Klient " + this + " wchodzi do urzędu");
            while (true) {
                Urzednik u = urzad.wolneOkienko();
                if (u == null) {
                    //System.out.println("Klient "+this+ " czeka");
                    Thread.sleep(5);
                    continue;
                }
                u.obslugaKlienta(this);
                urzad.zwolnionoOkienko(u);
                System.out.println("Klient " + this + " idzie do domu");
                break;
            }
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
