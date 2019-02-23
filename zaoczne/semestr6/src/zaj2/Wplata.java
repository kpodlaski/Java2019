package zaj2;

/**
 * Created by Krzysztof Podlaski on 23.02.2019.
 */
public class Wplata implements Comparable<Wplata> {
    private String ksywka;
    private int kwota;

    public Wplata(String ksywka, int kwota) {
        this.ksywka = ksywka;
        this.kwota = kwota;
    }

    public String getKsywka() {
        return ksywka;
    }

    public void setKsywka(String ksywka) {
        this.ksywka = ksywka;
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
