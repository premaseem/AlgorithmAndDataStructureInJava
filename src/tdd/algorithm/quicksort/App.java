package tdd.algorithm.quicksort;

public class App {
    public void quickSort(int[] arr, int start, int end) {

        if(start < end){
            int partitionId = getPartitionId(arr,start,end);
            quickSort(arr, start, partitionId -1);
            quickSort(arr,  partitionId +1,end);
        }
    }

    private int getPartitionId(int[] a,int start, int end) {
    int pivotNumber = a[end];
    int j=start-1;

        for(int i = start; i <= end-1; i++){
        if (a[i] <= pivotNumber) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        int swap = a[j+1];
        a[end] = swap;
        a[j+1] = pivotNumber;

    return j+1;
    }
}
