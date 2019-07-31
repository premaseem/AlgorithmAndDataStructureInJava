package javaConcepts.collection.comparable;

/**
 * Created by asee2278 on 2/4/17.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client{
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        al.add(new Student(105,"Aseem",40));

        Collections.sort(al);

        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println();

        Collections.sort(al,new NameComparator());

        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}


class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student st){
        if(this.age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
//        Student s1=(Student) o1;
//        Student s2=(Student) o2;

        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}


class NameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}