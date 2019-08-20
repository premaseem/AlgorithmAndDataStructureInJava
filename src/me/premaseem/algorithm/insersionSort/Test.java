package me.premaseem.algorithm.insersionSort;



public class Test {

    App app = new App();

    @org.junit.Test
    public void testSort() {
        int arr[] = {40, 20, 5, 2,};
        app.arrSort(arr);
//        app.printArr(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
            if (arr[i] > arr[i + 1]) {
                assert false;
            }
        }
    }
}