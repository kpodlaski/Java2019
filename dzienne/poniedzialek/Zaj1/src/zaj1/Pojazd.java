package zaj1;

/**
 * Created by Krzysztof Podlaski on 25.02.2019.
 */
public class Pojazd {
    public String marka;
    public String wlasciciel;
    public String nrRej;

    @Override
    public String toString() {
        return marka+" "+wlasciciel+" nr:"+
                nrRej;
    }
}
