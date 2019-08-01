package codechallenge.easy;

import org.junit.Test;

/**
 * Implement bubble sort
 */
public class BubbleSort {

    @Test
    public void test(){
        int[] a = {40,20,60,10,100,5};
        bubbleSort(a);
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]){
                assert false;
            }
        }
    }

    void bubbleSort(int[] a){

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-1-j; i++) {
                if (a[i] > a[i + 1]) {
                    int swap = a[i];
                    a[i + 1] = a[i];
                    a[i] = swap;
                }
            }
        }
    }
}
