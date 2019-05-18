package zaj4;

import java.util.Random;

public class PostClerk {

    char id;
    Random rand = new Random();

    public PostClerk(char a) {
        id = a;
    }

    public void serve(PostClient client){
        System.out.println("Urzędnik "+id +" obsługuje klienta "+client.id);
        //To klient miał zadanie robimy
        //client.task(this);
        try {
            Thread.sleep(rand.nextInt(1000)+30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Urzędnik "+id +" zakończył obsługę klienta "+client.id);
    }
}
