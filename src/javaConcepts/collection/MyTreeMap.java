package javaConcepts.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by asee2278 on 2/1/17.
 */
public class MyTreeMap {


    public static void main(String[] args) {
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        hm.put(103,"Rahul");
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(33,"Vijay");

        hm.remove(10233);

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

