package javaConcepts.sortImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asee2278 on 1/31/17.
 */
public class MySort {


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(348844);
        a.add(99);
        a.add(35);
        a.add(32555);
        a.add(32);
        a.add(26444);
        a.add(16);
        a.add(16);
        a.add(164444);
        a.add(164444);

        List<Integer> b = new ArrayList<Integer>();
        b.add(32);
        b.add(26444);
        b.add(16);
        b.add(16);
        b.add(164444);
        b.add(164444);

                a =b;
        Integer temp = 0;
        System.out.println(a);

        Integer count = 0;

        for (int j=0;j <a.size() ; j++){
            for (int i = 0; i < a.size()-j-1; i++) {
                count++;
                if (a.get(i) > a.get(i + 1)) {
                    temp = a.get(i);
                    a.set(i, a.get(i + 1));
                    a.set((i + 1), temp);
                }
            }
    }


//        for(int i = 0; i<a.size();i++){
////          System.out.println(a);
//            for(int j = 1;j<a.size();j++){
//                int temp;
//                count++;
//                if(a.get(j-1)>a.get(j)){
//
//                    temp = a.get(j);
//                    a.set(j, a.get(j-1));
//                    a.set(j-1, temp);
//
//                }
//                //System.out.println(a);
//            }
//        }

        System.out.println(a);
        System.out.print("total iteration"+count);



    }


}
