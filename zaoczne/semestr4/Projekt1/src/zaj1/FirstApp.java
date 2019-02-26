package zaj1;

/**
 * Created by Krzysztof Podlaski on 23.02.2019.
 */
public class FirstApp {

    public static void main(String[] args) {
        System.out.println("Nowy Program wystartował");
        Car car = new Car("Toyota","Avensis",2012);
        //car.setBrand("Toyota");
        //car.setModel("Avensis");
        //car.setYearOfProduction(2012);
        System.out.println(car.getBrand() + " "+ car.getModel()
                +" wyprodukowano w "+car.getYearOfProduction());
        System.out.println("__"+car);

        /*
        for(int i=0;true; i++){
            car = new Car("Toyota","Avensis",2012);
            car = null;
        }
        */

    }
}
