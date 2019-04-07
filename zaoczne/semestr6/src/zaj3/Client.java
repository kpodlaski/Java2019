package zaj3;

/**
 * Created by Krzysztof Podlaski on 07.04.2019.
 */
public class Client implements Runnable{

    public int id;
    private Offices offices;
    public Client(int id, Offices biuro){ this.id=id; offices=biuro;}
    public String toString(){return "Klient_"+id;}


    @Override
    public void run() {
        String officer;
        System.out.println(this + " wszedł do biura");
        while ( (officer = offices.getFreeOfficer())==null ){
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println(this + " podchodzi do okienka");
            offices.serveTheClient(this,officer);
            System.out.println(this + " idzie do domu");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Offices biuro = new Offices();
        for(int i=1; i<11; i++){
            Client c = new Client(i, biuro);
            Thread t = new Thread(c);
            t.start();
        }
    }
}
