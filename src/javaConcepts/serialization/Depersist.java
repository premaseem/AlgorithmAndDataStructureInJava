package javaConcepts.serialization;

/**
 * Created by asee2278 on 2/14/17.
 */
import java.io.*;
class Depersist{
    public static void main(String args[])throws Exception{

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("objectOut.txt"));

        Student s=(Student) in.readObject();
        System.out.println(s.id+" "+s.name + " " +s.marks);

        in.close();
    }
}