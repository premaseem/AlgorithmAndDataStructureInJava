package me.premaseem.algorithm.selectionsort;

public class Test {

    @org.junit.Test
    public void testSort() {
        int arr[] = {40, 20, 50, 100, 40, 80};
        selectionSort(arr);
        printArr(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("unsorted");
                assert false;
            }
        }
    }

    void selectionSort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < a.length; i++) {
                //find which is the smallest element to right of 'j'
                if (a[i] < a[minimumIndex])
                    minimumIndex = i;
            }//end of inner loop
            if (minimumIndex != j) { // if j is not minimum index then swap
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }//end of outer loop
    }//end of method


    public void printArr(int[] arr) {
        System.out.print("[ " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]" );
    }
}
