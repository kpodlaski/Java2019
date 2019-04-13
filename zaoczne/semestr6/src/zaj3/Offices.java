package zaj3;

import java.util.*;

/**
 * Created by Krzysztof Podlaski on 07.04.2019.
 */
public class Offices {
    Set<String> officers  = new LinkedHashSet<>();

    public Offices(){
        officers.add("A");
        officers.add("B");
        officers.add("C");
    }

    synchronized String getFreeOfficer(){
        Iterator<String> it = officers.iterator();
        if (it.hasNext()) {
            String officer = it.next();
            it.remove();
            return officer;
        }
        else {
            return null;
        }
    }
    private synchronized void makeOfficerAviable(String officer) {
        officers.add(officer);
    }
    Random rand = new Random();
    void serveTheClient(Client c, String officer) throws InterruptedException {
        System.out.println("Okienko "+officer+" zaczęło obsługę klienta "+c);
        int czas = rand.nextInt(60);
        Thread.sleep(30+czas);
        //c.task();
        System.out.println("Okienko "+officer+" zakończyło obsługę klienta "+c);
        makeOfficerAviable(officer);
    }




}
