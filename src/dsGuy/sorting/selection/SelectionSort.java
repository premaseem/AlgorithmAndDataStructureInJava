package dsGuy.sorting.selection;

public class SelectionSort {

    static void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            int minI = i;
            for (int j = i; j < a.length; j++) {
                if(a[minI] > a[j]){
                    minI = j;
                }
            }
            if(minI != i) {
                int swap = a[minI];
                a[minI] = a[i];
                a[i] = swap;
            }
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }//end of method

}//end of class
