package zaj3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

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
    void serveTheClient(Client c, String officer) throws InterruptedException {
        System.out.println("Okienko "+officer+" zaczęło obsługę klienta "+c);
        Thread.sleep(30);
        //c.task();
        System.out.println("Okienko "+officer+" zakończyło obsługę klienta "+c);
        makeOfficerAviable(officer);
    }




}
