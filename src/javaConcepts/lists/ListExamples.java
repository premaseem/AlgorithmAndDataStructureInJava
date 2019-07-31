package javaConcepts.lists;

import java.util.ArrayList;
//import java.util.Collections;

/**
 * Created by asee2278 on 1/30/17.
 */
public class ListExamples {


    Integer birds = 3;
    int animals = 5;

    Integer a = new Integer(animals);
    Integer b = new Integer("34");
    Integer sum = 0;

    Float sharePrice = 5.00232f;
    boolean flag;
    String name = "java training";

    static int []num = new int[3];  // array

    static ArrayList<Integer> al = new ArrayList<Integer>();




    public static void main(String[] args) {

        ListExamples obj = new ListExamples();
        obj.name = "fullStact";
//        System.out.print(obj.flag);
        obj.name = "new Name";
        obj.sum++;

        num[0]=22;
        num[1]=20;
        num[2]=26;
//        num[3]=40;

        al.add(13);
        al.add(3);
        al.add(3);
        al.add(3);
        al.add(300);
        al.add(3);
        al.add(3);
        al.add(23);
        al.add(3);
        al.add(3);
//        Collections.reverse(al);
//        Collections.sort(al);
//        Collections1 coll = new Collections1();

        Collections1.mySort(al);

System.out.print(al);





    }



}
