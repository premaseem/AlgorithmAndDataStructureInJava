package me.premaseem.algorithm.insersionSort;


import me.premaseem.MyUtils;

public class Test {

    App app = new App();

    @org.junit.Test
    public void testSort() {
        int arr[] = MyUtils.getIntArr();
        app.arrSort(arr);
        MyUtils.isArrSorted(arr);
    }
}