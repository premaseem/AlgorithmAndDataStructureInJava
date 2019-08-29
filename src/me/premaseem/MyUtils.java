package me.premaseem;

public class MyUtils {

    static public int[] getIntArr() {
        int[] arr = new int[]{70, -20, 30, 0, 40, 100};
        System.out.print("Unsorted array looks like => ");
        printArr(arr);
        return arr;
    }

    static public void printArr(int[] arr) {
        System.out.print("[ ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("]");

    }

    static public boolean isArrSorted(int[] ar) {
        System.out.print("Is array sorted? ... ");
        printArr(ar);
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i + 1] < ar[i]) {
                System.out.println("No, problem is " + ar[i + 1] + " > " + ar[i]);
                assert false;
            }

        }

        System.out.println("Yes");
        return true;
    }


}
