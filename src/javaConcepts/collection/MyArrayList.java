package javaConcepts.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by asee2278 on 2/1/17.
 */


class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }


    @Override
    public int hashCode(){
        return 420;
    }

}


public class MyArrayList {
    public static void main(String args[]) {

            PriorityQueue<String> queue=new PriorityQueue<String>();
            queue.add("Rahul");
            queue.add("Amit");
            queue.add("Vijay");
            queue.add("Karan");
            queue.add("Jai");
            queue.add("Rahul");

            System.out.println("head:"+queue.element());
            System.out.println("head:"+queue.peek());
            System.out.println("iterating the queue elements:");
            Iterator itr=queue.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            queue.remove();
            queue.poll();
            System.out.println("after removing two elements:");
            Iterator<String> itr2=queue.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }
        }
    }
