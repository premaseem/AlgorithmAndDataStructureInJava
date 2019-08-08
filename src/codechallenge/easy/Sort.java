package codechallenge.easy;

/*
Implement a sort algo given Arrays.sort() or Collections.sort() is not provided

 */
import org.junit.Test;

public class Sort {

    @Test
    public void t(){
        int[] arr = {5,3,6,2,9,6,};
        sort(arr);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i-1]>arr[i]){
                    assert false;
            }
        }
    }

    public void sort(int[]a) {

        for (int i=0; i < a.length; i++) {
            for (int j=0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
    }
}
