package javaConcepts.innerclass;

/**
 * Created by asee2278 on 2/8/17.
 */

abstract class Lady{
    abstract void eat();
}

interface i {
    public void anyMethod();
}

class AnonClass{
    public static void main(String args[]){
        Lady p= new Lady(){
            void eat(){
                System.out.println(" haha just created an object of Annonymus class ");
            }
        };
        i obj = new i(){
            public void anyMethod(){

            };
        };
        p.eat();
    }
}