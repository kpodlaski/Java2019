package zaj1;

/**
 * Created by Krzysztof Podlaski on 19.02.2019.
 */
public class Person {
    private String name;
    private String surname;
    private int height;

    public Person(String name, String surname, int height) {
        this.name = name;
        this.surname = surname;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDesc(){
        return name + " "+surname;
    }

    @Override
    public String toString() {
        return this.name+" "+surname+" height:"+height;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("DELETE OBJECT");
    }
}

