package me.premaseem.algorithm.selectionsort;

import me.premaseem.MyUtils;

public class Test {

    @org.junit.Test
    public void testSort() {
        int arr[] = {40, 20, 50, 100, 40, 80};
        selectionSort(arr);
        MyUtils.isArrSorted(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("unsorted");
                assert false;
            }
        }
    }

    void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int selectMinIndex = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < a[selectMinIndex]){
                    selectMinIndex = j;
                }
            }
            int swap = a[i];
            a[i] = a[selectMinIndex];
            a[selectMinIndex] = swap;

        }
    }}
