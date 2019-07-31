package javaConcepts.serialization;

/**
 * Created by asee2278 on 2/14/17.
 */
import java.io.Serializable;
public class Student implements Serializable{
    int id;
    String name;
     Integer marks;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.marks = 100;
    }
}

