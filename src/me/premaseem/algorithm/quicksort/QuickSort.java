package me.premaseem.algorithm.quicksort;

import me.premaseem.MyUtils;
import org.junit.Test;

public class QuickSort {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        int a2[] = {10, 30, 190, 120, 110, 50, 7};

        sort(a2, 0, 6);
        MyUtils.isArrSorted(a2);
    }



    int partition(int arr[], int low, int high)
    {
        int pi = (low-1); // index of smaller element
        for (int j=low; j<=high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] <= arr[high])
            {
                pi++;

                // swap arr[i] and arr[j]
                int temp = arr[pi];
                arr[pi] = arr[j];
                arr[j] = temp;
            }
        }
        return pi;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

}
