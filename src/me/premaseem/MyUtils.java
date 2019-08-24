package me.premaseem;

public class MyUtils {

    static public int[] getIntArr() {
        int[] arr = new int[]{70, 20, 30, 80, 40, 100};
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

    static public boolean isArrSorted(int[] arr) {
        System.out.print("Is array sorted? ... ");
        printArr(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                printArr(arr);
                System.out.println("No, problem is " + arr[i + 1] + " > " + arr[i]);
                assert false;
            }

        }

        System.out.println("Yes");
        return true;
    }


}
