package tdd.algorithm.binarySearch;

public class SearchApp {

    // return the index of number which matches search result
    public int binarySearch(int[] arr, int match) {

        // bp = begining pointer
        // ep = end pointer
        // mp = middle pointer
        int bp = 0, ep = arr.length-1;

        while (bp <= ep) {
            int mp = (ep + bp) / 2;
            int retrievedNum = arr[mp];

            if (retrievedNum == match) {
                return mp;
            }

            if (match < retrievedNum) {
            // since we have searched object at ap so lets reduce the end pointer not to include it. Can stuck if we do not move it
                ep = mp-1;
            } else {
            // if match number is bigger, and it not the mp, then lets move the bp +1 that way it would not stuck
                bp = mp+1;
            }
        }

        return -1;
    }


    public int binarySearchRecursive(int [] arr, int bp, int ep, int value){
        System.out.printf("\nsearch range [%s .. %s]",bp, ep);
        if( bp > ep){
            return -1;
        }

        int mp = (bp + ep) / 2;
        if (value == arr[mp]) {
            return mp;
        }
        if (value > arr[mp]) {
            return binarySearchRecursive(arr, mp+1,ep,value);
        }else{
            return binarySearchRecursive(arr, bp,mp-1,value);
        }
    }

    public int linearSearchRecursive(int [] arr, int index, int value){
        System.out.println("searching at index "+index);
        if(index >= arr.length){
            return -1;
        }
        if (arr[index] == value){
            return index;
        }else {
            return linearSearchRecursive(arr, index +1, value);
        }
    }

}
