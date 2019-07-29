package codebase1.algorithm.selectionsort;

public class App {


    public void arrSort(int[] arr) {

    for(int i=0; i<arr.length;i++){

        int smallestIndex = i;
        for(int j=i; j<arr.length;j++){
            if (arr[smallestIndex] > arr[j]){
            smallestIndex = j;
             }
           }
        int swap = arr[i];
        arr[i] = arr[smallestIndex];
        arr[smallestIndex] = swap;
    }
    }


    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("["+ arr[i] + "]");
        }
    }
}
