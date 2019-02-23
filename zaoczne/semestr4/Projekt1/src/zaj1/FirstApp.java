package zaj1;

/**
 * Created by Krzysztof Podlaski on 23.02.2019.
 */
public class FirstApp {

    public static void main(String[] args) {
        System.out.println("Nowy Program wystartował");
        Car car = new Car();
        car.brand="Toyota";
        car.model="Avensis";
        car.yearOfProduction = 2012;
        System.out.println(car.brand + " "+ car.model
                +" wyprodukowano w "+car.yearOfProduction);
    }
}
