package zaj4;

import java.util.ArrayList;
import java.util.List;

public class Post {

    List<PostClerk> freeClerks = new ArrayList<>();

    public void serve(PostClient client){
        PostClerk clerk = null;
        while(true){
            synchronized(this) {
                if (freeClerks.size() > 0) {
                    clerk = freeClerks.get(0);
                    freeClerks.remove(0);
                    break;
                }
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        clerk.serve(client);
        freeClerks.add(clerk);
        System.out.println("Wolni urzędnicy "+freeClerks.size());
    }

    public static void main(String[] args) throws InterruptedException {
        Post post = new Post();
        post.freeClerks.add(new PostClerk('A'));
        post.freeClerks.add(new PostClerk('B'));
        post.freeClerks.add(new PostClerk('C'));
        Thread[] watkiKlientow = new Thread[20];
        for(int i=1; i<=20; i++){
            Thread t = new Thread(new PostClient(i,post));
            t.start();
            watkiKlientow[i-1]=t;
            //t.join(); //Nie ponieważ mamy tak naprawdę jeden wątek
        }
        for (Thread t: watkiKlientow) {
            t.join();
        }
        System.out.println("Brak klientów Poczta się zamyka");

    }
}
