package zaj1;

/**
 * Created by Krzysztof Podlaski on 23.02.2019.
 */
public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return this.brand+" "+model+" rok:"+yearOfProduction;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Niszczę obiekt");
    }
}
