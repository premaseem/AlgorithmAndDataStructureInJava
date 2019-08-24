package codebase3.sorting.bubble;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length -1 -i; j++) {
				// if element is bigger then adjecent element, bubble it up.
				if(arr[j] > arr[j+1]){
					int swap = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = swap;
				}
			}

		}
	}



	
	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}// end of class