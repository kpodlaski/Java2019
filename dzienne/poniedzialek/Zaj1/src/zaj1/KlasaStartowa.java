package zaj1;

/**
 * Created by Krzysztof Podlaski on 25.02.2019.
 */
public class KlasaStartowa {

    public static void main(String[] args) {
        System.out.println("Start Applikacji");
        Pojazd p = new Pojazd();
        p.marka = "VW Golf";
        p.wlasciciel= "Adam Adamski";
        p.nrRej = "EL1234A";
        System.out.println(
                p.marka + " "+
                p.wlasciciel +" nr rej.:"+
                p.nrRej
        );
        System.out.println(p+"__");


    }
}
