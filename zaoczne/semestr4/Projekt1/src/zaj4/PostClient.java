package zaj4;

public class PostClient implements Runnable {
    public int  id;
    Post post;

    public PostClient(int id, Post post){
        this.id=id;
        this.post=post;
    }

    @Override
    public void run() {
        System.out.println("Klient "+id+" wchodzi na Pocztę");
        post.serve(this);
        System.out.println("Klient "+id+" idzie do domu");
    }

    public void task(PostClerk clerk){
        //TODO and use
    }
}
