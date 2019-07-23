package tdd.algorithm.binarySearch;

public class SearchApp {

    // return the index of number which matches search result
    public int binarySearch(int[] arr, int match) {

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


}
