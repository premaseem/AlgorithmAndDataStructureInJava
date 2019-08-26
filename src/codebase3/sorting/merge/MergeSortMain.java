package codebase3.sorting.merge;

public class MergeSortMain {

	public static void main(String[] args) {
		
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		
		System.out.println("User entered Array: ");
		MergeSort.printArray(array);
		
		long start = System.nanoTime();
		MergeSort.mergeSort(array, 0, array.length-1);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end-start));
		
		System.out.println("\nAfter sorting: ");
		MergeSort.printArray(array);
	}//end of method

}//end of class
