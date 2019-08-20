package me.premaseem.algorithm.mergesort;


public class Test {

    App app = new App();

    @org.junit.Test
    public void testSort() {
        int arr[] = {40, 20, 50, 100, 40, 80};
        //int arr[] = {20, 40, 40, 50, 50, 100};
        app.arrSort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                assert false;
            }
        }
    }

//    @org.junit.Test
//    public void testMerge(){
//
//        int arr[] = {20, 40, 50, 10, 15, 100};
//        int newArr[] = app.merge(arr,0,3);
//
//        for (int i = 0; i < newArr.length-1; i++) {
//            System.out.println(newArr[i]);
//            if (newArr[i] > newArr[i + 1]) {
//                assert false;
//            }
//        }
//
//    }
}