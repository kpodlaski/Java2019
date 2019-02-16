package zaj1;

import java.util.Arrays;
//zaliczenie
//http://merlin.phys.uni.lodz.pl/kft-old/people/KPodlaski/zaj/java/Java_zaliczenie_zadania.pdf
/**
 * Created by Krzysztof Podlaski on 16.02.2019.
 */
public class ComputerElement implements Comparable<ComputerElement>{
    private String name;
    private double price;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name+" "+price;
    }

    public ComputerElement(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public int compareTo(ComputerElement o) {
        return (int) (this.price-o.price);
    }

    public static void main(String[] args) {
        ComputerElement ce =
                new ComputerElement("Kara graficzna GForce XYZ123",
                        4500,
                        "Zintegrowana karta mobilna ....");
        ComputerElement[] elements = new ComputerElement[3];
        elements[0]=ce;
        elements[1]=new ComputerElement("Kara muzyczna",
                        1300,
                        "Zintegrowana karta muzyczna ....");
        elements[2]=new ComputerElement("Matryca",
                1200,
                "Matryca LCD/HD  matowa");

        System.out.println(ce);
        System.out.println(Arrays.toString(elements));
        for(int i=0; i<elements.length; i++)
            System.out.println(elements[i]);
        System.out.println("---FOR EACH --");
        for(ComputerElement c : elements)
            System.out.println(c);
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));
        System.out.println("---SORT BY NAME --");
        Arrays.sort(elements,new ComputerElementComparatorByName());
        System.out.println(Arrays.toString(elements));
    }


}
