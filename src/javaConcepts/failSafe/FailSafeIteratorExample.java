package javaConcepts.failSafe;

/**
 * Created by asee2278 on 2/13/17.
 */
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample
{
    public static void main(String[] args)
    {
        //Creating a ConcurrentHashMap

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

        //Adding elements to map

        map.put("ONE", 1);

        map.put("TWO", 2);

        map.put("THREE", 3);

        map.put("FOUR", 4);

        //Getting an Iterator from map

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext())
        {
            String key = (String) it.next();

            System.out.println(key+" : "+map.get(key));

            map.put("FIVE", 5);     //This will not be reflected in the Iterator
        }

        it = map.keySet().iterator();

        while (it.hasNext())
        {
            String key = (String) it.next();

            System.out.println(key+" : "+map.get(key));

            map.put("FIVE", 10);     //This will not be reflected in the Iterator
        }

        it = map.keySet().iterator();

        while (it.hasNext())
        {
            String key = (String) it.next();

            System.out.println(key+" : "+map.get(key));

            map.put("FIVE", 10);     //This will not be reflected in the Iterator
        }


    }
}