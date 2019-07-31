package javaConcepts.variableShadowing;

/**
 * Created by asee2278 on 1/29/17.
 */
public class Client {


    public static void main(String[] args) {

        Bike vechile = new Bike();
        Vehicle vBike = new Bike();
        Vehicle truck = new Truck();
        System.out.println(truck.engineSound());





    }

}
