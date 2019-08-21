package me.premaseem.datastructure.hashtable;

import org.junit.Test;

import java.rmi.server.ExportException;
import java.util.*;

/*
Implement the map data structure on your own, using the language of choice

 */
public class MyHashTable_2 {

    // Test Driven Development by Aseem Jain

    @Test(expected = Exception.class)
    public void test() throws Exception {

        new HashMap<>();
        MyHashTable2 mp = new MyHashTable2();
        mp.put("prem",7);
        mp.put("radha",72);
        mp.put("geeta",74);
        mp.put("sunita",76);
        mp.put("atul",87);
        mp.put("rakesh",37);
        mp.put("aklesh",72);

        // try to add duplicate keys and test exception
        mp.put("aklesh",72);


        assert 7 == mp.get("prem");
        assert 72 == mp.get("aklesh");
        assert 87 == mp.get("atul");
        assert null == mp.get("noting");

        System.out.println(mp.getKeySet());

        mp.prettyPrint();
    }


}

class Value{
    String k;
    int v;

    public Value( String k, int v){
        this.k = k;
        this.v = v;
    }
}

class MyHashTable2 {

    LinkedList<Value> [] map = new LinkedList[3];


    void put(String k, int v) throws Exception{
        if(getKeySet().contains(k)){
            throw new Exception("Duplicate key exception");
        }
        LinkedList<Value> bucket = getBucket(k);
        bucket.addFirst(new Value(k,v));
    }

    Integer get(String k){
        LinkedList<Value> bucket = getBucket(k);
        for( Value v: bucket){
            if(k == v.k){
                return v.v;
            }
        }
        return null;
    }

    Set<String> getKeySet(){
        Set<String> keys = new HashSet<>();
        for(LinkedList<Value> bucket: map){
            for( Value v: bucket){
                keys.add(v.k);
            }
        }
        return keys;
    }

    private LinkedList<Value>  getBucket(String k) {
        int h = k.hashCode();
        int index =Math.abs((h % map.length));
        LinkedList<Value> bucket =  map[index];
        if ( null == bucket){
            bucket = new LinkedList<>();
        }
        map[index] = bucket;
        return bucket;

    }

    void prettyPrint(){
        for(String k : getKeySet()){
            System.out.printf("\n { %s : %s }", k,get(k));
        }
    }

}