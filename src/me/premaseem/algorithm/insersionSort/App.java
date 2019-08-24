package me.premaseem.algorithm.insersionSort;

public class App {
    public void arrSort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            // insertion key
            int ik = a[i];

            // inner loop for sorted array
            int j = i-1;

            // until element at j is bigger then insert key,
            // keep shifting it towards right and make space
            // for insertion key to be placed
            while(j>=0 && a[j]>ik){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = ik;

        }



//        {
//            int n = arr.length;
//            for (int i = 1; i < n; ++i) {
//                int key = arr[i];
//                int j = i - 1;
//
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//                while (j >= 0 && arr[j] > key) {
//                    arr[j + 1] = arr[j];
//                    j--;
//                }
//                arr[j + 1] = key;
//            }
//        }



    }

}
