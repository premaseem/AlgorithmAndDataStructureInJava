package dsGuy.sorting.selection;

public class SelectionSortMain {

	public static void main(String[] args) {
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		
		System.out.println("User entered Array: ");
		SelectionSort.printArray(array);
		
		SelectionSort.selectionSort(array);
		
		System.out.println("\n\nAfter sorting: ");
		SelectionSort.printArray(array);
	}//end of method

}//end of class