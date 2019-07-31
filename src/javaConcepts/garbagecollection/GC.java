package javaConcepts.garbagecollection;

/**
 * Created by asee2278 on 2/6/17.
 */
public class GC {
    public void finalize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String args[]){
        GC s1=new GC();
        GC s2=new GC();
        s1=null;

        System.gc();
    }
}