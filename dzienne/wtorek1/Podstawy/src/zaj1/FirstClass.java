package zaj1;

/**
 * Created by Krzysztof Podlaski on 19.02.2019.
 */
public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Witam w Java");
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        Person p = new Person("Adam","Małysz",40);
        //p.name = "Adam";//new String("Adam");
        //p.surname = "Małysz";
        //p.age = 40;
        p.setName("Adaś");
        System.out.println(p.getName()+" "
                +p.getSurname()+" lat:"+p.getAge());
        System.out.println("osoba:" +p);
        /*while (true){
            Person p2 = new Person("Jane","Doe",23);
        }
        */

    }
}
