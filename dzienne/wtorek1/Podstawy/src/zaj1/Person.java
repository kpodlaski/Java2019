package zaj1;

/**
 * Created by Krzysztof Podlaski on 19.02.2019.
 */
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("DESTROY OBJECT");
    }

    @Override
    public String toString() {
        return this.name+" "+surname+" lat:"+age;
    }
}
