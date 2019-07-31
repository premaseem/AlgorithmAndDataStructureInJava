package javaConcepts.variableShadowing;

/**
 * Created by asee2278 on 1/29/17.
 */
public class Car extends Vehicle {

    public String skidAndTurn(){
        return "Bike stunt";
    }

    String engineSound(){

        return "Voo voo ";
    }

    public String stunt(){
        return skidAndTurn();
    }

}
