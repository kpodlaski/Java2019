package zaj2;

/**
 * Created by Krzysztof Podlaski on 26.02.2019.
 */
public class GoscHotelowy {
    String imie;
    String nazwisko;
    char plec;
    String nrPokoju;
    double cena;

    public GoscHotelowy(String imie, String nazwisko, char plec, String nrPokoju, String cena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nrPokoju = nrPokoju;
        this.cena = Double.parseDouble(cena);
    }

    @Override
    public String toString() {
        return imie + " "+nazwisko +" <"+plec+">"
                +" nr. pokoju:"+nrPokoju+" cena:"+cena;
    }
}
