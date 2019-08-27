package me.premaseem.practiceRepeatation;

import me.premaseem.MyUtils;
import org.junit.Test;


public class MergeSort {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] intArr = MyUtils.getIntArr();
        sort(intArr);
        MyUtils.isArrSorted(intArr);

    }

    void sort(int[] a){
        mergeSort(a,0,a.length-1);
    }

    private void mergeSort(int[] a, int l, int r) {
//        if(r > l) {
//            int m =  (r-l) / 2;
//            mergeSort(a,l,m);
//            mergeSort(a,m+1,r);
//            merge(a,l,m,r);
//        }

        if (r > l) {
            int m = (l + r) / 2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
//            realMerge(a, l, m, r);
            merge(a, l, m, r);
        }
    }

    void merge(int[] a, int l, int m , int r){

        // size
        int las = m-l+1;
        int ras = r-m;

        // create arrays
        int [] la = new int[las];
        int [] ra = new int[ras];

        // copy elements
        for (int i = 0; i < las-1; i++) {
            la[i]= a[l+i];
        }

        for (int i = 0; i < ras - 1; i++) {
            ra[i] = a[m+i+1];
        }

        int li=0,ri=0;
        // merge is heart of algo
        for (int i = l; i <= r; i++) {
            int le = Integer.MAX_VALUE;
            int re = Integer.MAX_VALUE;

            if(li<las){
                le=la[li];
            }
            if(ri<ras){
                re=ra[ri];
            }

            if(le<re){
                a[i] = le;
                li++;
            }else{
                a[i] = re;
                ri++;
            }


        }
    }
}
