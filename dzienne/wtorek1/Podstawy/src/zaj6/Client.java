package zaj6;

/**
 * Created by Krzysztof Podlaski on 09.04.2019.
 */
public class Client implements Runnable{
    private int id;
    private PostOffice postOffice;
    public Client(int id, PostOffice po){
        this.id=id;
        postOffice=po;
    }

    @Override
    public void run() {
        System.out.println("Klient "+this +" wchodzi na pocztę");
        Officer o;
        do {
            o = postOffice.getFreeOfficer();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (o==null);
        o.serveClient(this);
        postOffice.makeOfficerFree(o);
        System.out.println("Klient "+this +" idzie do domu");
    }
    public String toString(){
        return Integer.toString(id);
    }

    public static void main(String[] args) {
        PostOffice po = new PostOffice();
        for (int i=0; i<30; i++){
            Thread t = new Thread(new Client(i+1,po));
            t.start();
        }

    }
}
