package codebase3.sorting.quick;

public class QuickSort {
	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot-1 );
			quickSort(array, pivot + 1,end);
		}
	}//end of method

	
	static int partition(int[] array, int p, int q) {
//		int pivot = q;
		int i = p-1;
		for (int j = p; j <= q; j++) {
			if (array[j] <= array[q]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return i;

	}//end of method
	
	
	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}//end of method
	
}//end of class
