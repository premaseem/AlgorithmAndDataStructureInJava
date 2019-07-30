package codebase1.algorithm.bubblesort;

public class BubbleSort {

    public void sort(int[] a){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int swap = a[j];
                    a[j] = a [j+1];
                    a[j+1] = swap;
                }
            }
        }

    }
}
