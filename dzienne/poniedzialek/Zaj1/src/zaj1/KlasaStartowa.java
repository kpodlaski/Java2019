package zaj1;

/**
 * Created by Krzysztof Podlaski on 25.02.2019.
 */
public class KlasaStartowa {

    public static void main(String[] args) {
        System.out.println("Start Applikacji");
        Pojazd p = new Pojazd(
                "VW Golf",
                "Adam Adamski",
                "EL1234A");
        System.out.println(
                p.getMarka() + " "+
                p.getWlasciciel() +" nr rej.:"+
                p.getNrRej()
        );
        System.out.println(p+"__");
        for (int i=0; true; i++){
            p = new Pojazd(
                    "VW Golf",
                    "Adam Adamski",
                    "EL1234A");
        }


    }
}
