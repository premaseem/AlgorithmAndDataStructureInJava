package dsGuy.sorting.heap;

public class HeapSortMain {

	public static void main(String[] args) {
		
		int arr[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		HeapSort hs = new HeapSort(arr);
		
		System.out.println("User entered Array: ");
		hs.printArray();
		System.out.println("\n");
		
		hs.sort();
		
		System.out.println("\n\nAfter sorting: ");
		hs.printArray();
	}//end of method

}//end of class
