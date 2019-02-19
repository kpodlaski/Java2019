package zaj1;

/**
 * Created by Krzysztof Podlaski on 19.02.2019.
 */
public class FirstApp {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        Person p = new Person("Jane",
                "Doe",174);
        //new String("Doe");
        //p.name  = "Jane";
        //p.surname = "Doe";
        //p.height=174;
        System.out.println(p.getName() + " "
                +p.getSurname()+" wzrost:"+p.getHeight());
        System.out.println("Person:"+p);
        while(true){
            p= new Person("John", "Doe",168);
        }
    }
}
