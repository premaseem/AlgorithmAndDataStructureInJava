package me.premaseem.practiceRepeatation;

import me.premaseem.MyUtils;
import org.junit.Test;

public class BubbleSort {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        // Bubble Sort
        int[] intArr = MyUtils.getIntArr();
        bubbleSort(intArr);
        MyUtils.isArrSorted(intArr);

        // Selection Sort
        intArr = MyUtils.getIntArr();
        selectionSort(intArr);
        MyUtils.isArrSorted(intArr);

        // Insertion Sort
        intArr = MyUtils.getIntArr();
        insertionSort(intArr);
        MyUtils.isArrSorted(intArr);

        // Quick Sort
        intArr = MyUtils.getIntArr();
        quicksort(intArr, 0, intArr.length - 1);
        MyUtils.isArrSorted(intArr);

        // Merge Sort
        intArr = MyUtils.getIntArr();
        mergeSort(intArr, 0, intArr.length - 1);
        MyUtils.isArrSorted(intArr);

    }



    void mergeSort(int[] a, int l, int r){

        if(r>l){
            int m = (l+r) / 2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,m,r);
        }

    }

    void merge(int[] a, int l, int m, int r){

        int las = m-l+1;
        int ras = r-m;

        // int create new array
        int[] la = new int[las];
        int[] ra = new int[ras];

        // populate
        for (int i = l; i < las; i++) {
            la[i] = a[l+i];
        }

        for (int i = m; i < ras; i++) {
            ra[i] = a[m+i];
        }

        int li=0;
        int ri=0;
        for (int i = l; i <= r; i++) {

            int lae = Integer.MAX_VALUE;
            int rae = Integer.MAX_VALUE;

            if(li < las){
                lae = la[li];
            }

            if(ri < ras){
                rae = ra[ri];
            }

            if(lae < rae){
                a[i] = lae;
                li++;
            }else{
                a[i] = rae;
                ri++;
            }
        }

    }

    void bubbleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
    }

    void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int minI = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < a[minI] ){
                    minI = j;
                }

            }
            if(minI != i) {
                int t = a[minI];
                a[minI] = a[i];
                a[i] = t;
            }
        }

//        for (int i = 0; i < a.length; i++) {
//            int minI = i;
//
//            for (int j = i; j < a.length; j++) {
//                if (a[j] < a[minI]) {
//                    minI = j;
//                }
//            }
//            if (minI != i) {
//                int swap = a[i];
//                a[i] = a[minI];
//                a[minI] = swap;
//            }
//        }
    }

    void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int j = i;
            int insertionKey = a[j];

            while (j > 0 && insertionKey < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            // insertion key goes to the intented place.
            a[j] = insertionKey;

        }
    }

    void quicksort(int[] a, int s, int e) {
        if (s < e) {
            int pi = getPartition(a, s, e);
            quicksort(a, s, pi - 1);
            quicksort(a, pi + 1, e);


        }
    }

    private int getPartition(int[] a, int s, int e) {
        int j = s - 1;
        for (int i = s; i <= e; i++) {
            if (a[i] <= a[e]) {
                j++;
                int swap = a[j];
                a[j] = a[i];
                a[i] = swap;
            }
        }
        return j;


    }

}
