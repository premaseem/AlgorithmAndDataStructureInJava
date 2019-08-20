package me.premaseem.algorithm.bubblesort;

public class Test {

    @org.junit.Test
    public void test(){
        BubbleSort bs = new BubbleSort();
        int arr[] = {40, 20, 50, 100, 40, 80};
        //int arr[] = {20, 40, 40, 50, 50, 100};
        bs.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
            if (arr[i] > arr[i + 1]) {
                assert false;
            }
        }
    }
}
