package algoBootcamp.algo.quicksort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] inputArray = { 12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
		quickSort(inputArray, 0, inputArray.length-1);
		
		System.out.println(Arrays.toString(inputArray));
	}
	
	
	public static void quickSort(int [] inputArray, int start, int end){
		if(start < end){
			int pp = partition(inputArray, start, end); // index position of the correctly placed value in the array
			quickSort(inputArray, start, pp-1); // sorts the left half of the range
			quickSort(inputArray, pp+1, end); // sorts the right half of the range
		}
	}
	
	public static int partition(int [] inputArray, int start, int end){
		
		int pivot = inputArray[end];
		// in the first iteration, i starts from -1
		int i = start - 1;
		for(int j = start; j <= end-1; j++){
			if(inputArray[j] <= pivot){
				i++;
				// we are swapping below
				int ival = inputArray[i];
				int jval = inputArray[j];
				inputArray[i] = jval;
				inputArray[j] = ival;
			}
		}
		
		// put the pivot value in the correct slot next
		int ival = inputArray[i+1];
		inputArray[end] = ival;
		inputArray[i+1] = pivot; // here, pivot value is placed in the correct slot of the array.
		
		return i+1;
	}
}
