package zaj1;

/**
 * Created by Krzysztof Podlaski on 25.02.2019.
 */
public class Pojazd {
    private String marka;
    private String wlasciciel;
    private String nrRej;

    public Pojazd(String marka, String wlasciciel, String nrRej) {
        this.marka = marka;
        this.wlasciciel = wlasciciel;
        this.nrRej = nrRej;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public String getNrRej() {
        return nrRej;
    }

    public void setNrRej(String nrRej) {
        this.nrRej = nrRej;
    }

    @Override
    public String toString() {
        return marka+" "+wlasciciel+" nr:"+
                nrRej;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Niszczę obiekt");
    }
}
