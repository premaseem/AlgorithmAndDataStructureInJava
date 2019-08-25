package me.premaseem.algorithm.insersionSort;

import me.premaseem.MyUtils;
import org.junit.Test;

public class InsertionSort {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] a = MyUtils.getIntArr();
        sort(a);
        MyUtils.isArrSorted(a);

    }

    public void sort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            // insertion key
            int ik = a[i];
            int j = i - 1;

            // compare the sorted array with the insertion key and
            // shift to right to make place for the insertion key.
            while (j >= 0 && a[j] > ik) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ik;

        }

    }

}
