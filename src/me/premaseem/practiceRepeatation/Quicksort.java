package me.premaseem.practiceRepeatation;

import me.premaseem.MyUtils;
import org.junit.Test;

public class Quicksort {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] intArr = MyUtils.getIntArr();
        sort(intArr);
        MyUtils.isArrSorted(intArr);

    }

    void sort(int[] a){
        quickSort(a,0,a.length-1);
    }

    // partition, start and end
    void quickSort(int[] a, int s, int e){
        if(s<e){
            int partitionIndex = getPartition(a,s,e);
            quickSort(a,s,partitionIndex -1);
            quickSort(a,partitionIndex +1 , e);
        }

    }

    private int getPartition(int[] a, int s, int e) {

        int j = s-1;
        for (int i = s; i <= e; i++) {
            if(a[i] <= a[e]){
                j++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }

        }
        return j;
    }


}
