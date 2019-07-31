package javaConcepts.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asee2278 on 1/31/17.
 */



class SetEample{
    public static void main(String args[]){
        //Creating HashSet and adding elements
//        Set<String> set=new HashSet<String>();
        List<String> set = new ArrayList<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}