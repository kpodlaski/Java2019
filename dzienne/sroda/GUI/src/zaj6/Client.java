package zaj6;

/**
 * Created by Krzysztof Podlaski on 10.04.2019.
 */
public class Client implements Runnable {
    private int id;
    private PostOffice post;

    public Client(int i, PostOffice post) {
        this.id=i;
        this.post=post;
    }

    @Override
    public void run() {
        System.out.println("Klient "+id+" wchodzi do pocztę");
        Counter c = null;
        try {
            do {
                //System.out.println("Klient "+id +" zerka na okienka");
                c = post.reserveCounter();
                Thread.sleep(5);
            }
            while (c == null);
            c.serveClient(this);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        post.makeCounterAvailable(c);
        System.out.println("Klient "+id+" idzie do domu");
    }

    public String toString(){
        return Integer.toString(id);
    }

    public static void main(String[] args) {
        PostOffice post = new PostOffice();
        for (int i=0; i<15; i++){
            Thread t = new Thread(new Client(i+1, post));
            t.start();
        }
    }
}
