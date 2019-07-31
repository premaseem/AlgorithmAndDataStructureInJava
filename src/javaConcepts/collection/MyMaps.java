package javaConcepts.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by asee2278 on 2/1/17.
 */
public class MyMaps {

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<String,String>();
        map.put("100","Amit");
        map.put("101","Vijay");
        map.put(null,"aseem");
        map.put(null,null);


        map.put("102","Aseem");

        for(Map.Entry m  :  map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();

        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }


}




