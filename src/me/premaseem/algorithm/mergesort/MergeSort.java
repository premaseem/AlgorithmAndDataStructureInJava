package me.premaseem.algorithm.mergesort;

/*
Implement merge sort
*/

import me.premaseem.MyUtils;
import org.junit.Test;

public class MergeSort {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        int a2[] = {10, 30, 190, 120, 110, 50, 7};

        mergeSort(a2, 0, a2.length - 1);
        MyUtils.isArrSorted(a2);
    }


    void mergeSort(int[] a, int l, int r) {
        if (r > l) {
            int m = (l + r) / 2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            realMerge(a, l, m, r);
        }
    }

    void realMerge(int[] a, int l, int m, int r) {

        // find out array size
        int las = m - l + 1; // add one because of zero index
        int ras = r - m;
        int[] la = new int[las];
        int[] ra = new int[ras];

        // populate elements

        for (int i = 0; i < las; i++) {
            la[i] = a[l + i];
        }

        for (int i = 0; i < ras; i++) {
            ra[i] = a[m + 1 + i]; // since m is covered in last loop, add m+1 here
        }

        // merge and put it on real array
        int i1 = 0, i2 = 0;

        for (int i = l; i <= r; i++) {
            int lav = Integer.MAX_VALUE;
            int rav = Integer.MAX_VALUE;

            if (i1 < las) {
                lav = la[i1];
            }
            if (i2 < ras) {
                rav = ra[i2];
            }

            if (lav < rav) {
                a[i] = lav;
                i1++;
            } else {
                a[i] = rav;
                i2++;
            }
        }
    }

}
