package me.premaseem.algorithm.bubblesort;

import me.premaseem.MyUtils;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSort {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] a = MyUtils.getIntArr();
        sort(a);
        MyUtils.isArrSorted(a);

    }

    public void sort(int[] a){

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length -1 ; j++) {

                if(a[j] > a[j+1]){
                    System.out.println( a[j] + "  " + a[j+1]);
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                }

            }

        }

    }


}
