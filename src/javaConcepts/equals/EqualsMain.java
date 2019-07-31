package javaConcepts.equals;

import java.util.ArrayList;

/**
 * Created by asee2278 on 1/31/17.
 */

class Car1{

    public Car1(String name){
        this.name = name;
    }

    String name = null;

    @Override
    public boolean equals(Object obj) {
        if(this.name.equals(((Car1)obj).name)){
            return true;
        }
        return false;
    }

}

public class EqualsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car1 c1 =new  Car1("bmw");
        Car1 c2 =new  Car1("bmw");
        Car1 c3 =new  Car1("honda");

        System.out.println("are they equal "+c1.equals(c2));



        // TODO code application logic here
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Subash Adhikari",28));
        people.add(new Person("K",28));
        people.add(new Person("premaseem",4));
        people.add(new Person("premaseem",4));
        people.add(new Person("Subash Adhikari",28));

        for (int i=0;i<people.size()-1;i++){
            for (int y=i+1;y<=people.size()-1;y++){
                System.out.print("-- " + people.get(i).getName() + " - VS - " + people.get(y).getName());
                boolean check = people.get(i).equals(people.get(y));
                System.out.println(" => Are these equal "+check);
            }
        }
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Person.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Person other = (Person) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + this.age;
        return hash;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}