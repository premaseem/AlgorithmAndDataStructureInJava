package javaConcepts.serialization;

/**
 * Created by asee2278 on 2/14/17.
 */

import java.io.*;
class Persist{
    public static void main(String args[])throws Exception{
        Student s1 =new Student(211,"Naren");
//        Student sw =new Student(222,"Spoort");

        FileOutputStream fout=new FileOutputStream("objectOut.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        System.out.println("success");
    }
}