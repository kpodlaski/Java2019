package zaj6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 09.04.2019.
 */
public class PostOffice {
    List<Officer> officers = new ArrayList<>();

    public synchronized Officer getFreeOfficer(){
        if (officers.size()==0) return null;
        Iterator<Officer> it = officers.iterator();
        Officer o = it.next();
        it.remove();
        return o;
    }

    public synchronized void makeOfficerFree(Officer o){
        officers.add(o);
    }

    public PostOffice(){
        officers.add(new Officer('A'));
        officers.add(new Officer('B'));
        officers.add(new Officer('C'));
    }
}
