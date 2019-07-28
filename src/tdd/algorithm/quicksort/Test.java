package tdd.algorithm.quicksort;

public class Test {

    App app = new App();

    @org.junit.Test
    public void testSort() {
        int a[] = {40, 20, 50, 100, 40, 80};
        //int arr[] = {20, 40, 40, 50, 50, 100};

        app.quickSort(a,0, a.length-1);


        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
            if (a[i] > a[i + 1]) {
                assert false;
            }
        }
    }

}