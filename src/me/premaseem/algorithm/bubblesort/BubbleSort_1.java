package me.premaseem.algorithm.bubblesort;

public class BubbleSort_1 {

    @org.junit.Test
    public void test(){
        BubbleSort_1 bs = new BubbleSort_1();
        int arr[] = {40, 20, 50, 100,  80};
        //int arr[] = {20, 40, 40, 50, 50, 100};
//        bs.sort(arr);
        bs.sortBubble(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(" "+arr[i]);
            if (arr[i] >= arr[i + 1]) {
//                assert false;
            }
        }


    }


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

    public void sortBubble(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                System.out.println(a[i] +" "+ a[j]);
                if(a[i] < a[j]){
                    int swap = a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
            System.out.println("next pass" );
        }
    }
}
