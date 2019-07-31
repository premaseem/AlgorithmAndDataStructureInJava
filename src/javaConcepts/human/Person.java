package javaConcepts.human;

/**
 * Created by asee2278 on 1/28/17.
 * This class is responsible to define a person.
 */
public class Person {

    private String name = null;

    public void setAge(Integer age) {

        if(age <0){
            System.out.println("Since persons age cannot be negative, setting the default value to 0");
            this.age=0;

            return;
        }

        if(age >100){
            System.out.println("Since persons age cannot be more than 100, setting the default value to 40");
            this.age=40;
            return;
        }

        this.age = age;
    }

    private Integer age = null;
    private String food = null;

    public void eat(String food){
        this.food= food;
    }


    public void personDeatils(){
        System.out.println(" Name " + name + " has age " + age + " and eats " + food   );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name,int a) {
        this.name = name;
    }

}
