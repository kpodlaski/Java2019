package zaj1;

/**
 * Created by Krzysztof Podlaski on 20.02.2019.
 */
public class Wplata implements Comparable<Wplata>{
    private String imie;
    private int kwota;

    public Wplata(String imie, int kwota) {
        this.imie = imie;
        this.kwota = kwota;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    @Override
    public int compareTo(Wplata o) {
        return kwota-o.kwota;
    }
}
