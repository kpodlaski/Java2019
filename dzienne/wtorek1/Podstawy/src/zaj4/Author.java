package zaj4;

/**
 * Created by Krzysztof Podlaski on 26.03.2019.
 */
public class Author implements Comparable<Author> {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public int compareTo(Author o) {
        int x =  surname.compareToIgnoreCase(o.surname);
        if (x != 0) return x;
        return name.compareToIgnoreCase(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Author author = (Author) o;

        if (name != null ? !name.equalsIgnoreCase(author.name) :
                author.name != null) return false;
        return surname != null ?
                surname.equalsIgnoreCase(author.surname) :
                author.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.toLowerCase().hashCode() : 0;
        result = 31 * result +
           (surname != null ? surname.toLowerCase().hashCode() : 0);
        return result;
    }

    public String toString(){
        return name +" "+surname;
    }
}
