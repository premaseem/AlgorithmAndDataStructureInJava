package javaConcepts.variableShadowing;

/**
 * Created by asee2278 on 1/29/17.
 */
public abstract class Vehicle extends Object{

    int noOfWheel=4;

     abstract String engineSound();

    public String stunt(){
        return "Vehile stunt";
    }


    @Override
    public String toString() {

        return " vars " + noOfWheel +" "+ getClass().getName();
    }
}
