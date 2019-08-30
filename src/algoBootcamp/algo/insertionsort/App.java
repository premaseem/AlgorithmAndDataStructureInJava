package algoBootcamp.algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int myArray[] = insertionSort(new int[] {9,8,99, 110, 8,87,637, 8,3,13,87,12,99});
		
		for(int i =0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}
	
	public static int[] insertionSort(int [] a){
		for(int i= 1; i < a.length; i++){
			int element = a[i]; // element variable contains the data we intend on bringing over to the sorted area
			int j = i-1; // j variable points to the index position of the last value in the sorted area
			while(j>=0 && a[j] > element){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}

}
