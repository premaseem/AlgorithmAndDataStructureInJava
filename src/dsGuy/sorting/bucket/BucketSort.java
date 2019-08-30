package dsGuy.sorting.bucket;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	int arr[];
	
	
	//Constructor
	public BucketSort(int arr[]) {
		this.arr = arr;
	}
	
	
	//Prints Array
	public void printArray() {
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			tmp++;
			if(tmp == 20) {
				System.out.println();
				tmp = 0;
			}
		}	
	}
	
	
	//Prints Buckets
	public void printBucket(ArrayList<Integer>[] buckets) {
		for(int i=0; i<buckets.length; i++) {
			System.out.println("\nBucket#" + i + " :");
			for (int j=0; j<buckets[i].size(); j++) {
				System.out.print(buckets[i].get(j)+"  ");
			}
		}
		
	}
	
	//Sorting method
	public void bucketSort() {
		
		//Create sqrt# of buckets, so that the distribution is even
		int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		
		
		//Find the min and max value from the array
		for(int value: arr) {
			if(value < minValue) {
				minValue = value;
			}else if (value > maxValue) {
				maxValue = value;
			}
		}
		
		
		//Create an array of buckets
		ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
		
		
		//initializing empty buckets
		for(int i =0;i<buckets.length;i++) {
			buckets[i] = new ArrayList<Integer>();	 
		}
		
		
		for(int value: arr) {
			int bucketNumber = (int) Math.ceil ((value *  numberOfBuckets) / maxValue);
			//System.out.println("bucketNumber: " + bucketNumber);
			buckets[bucketNumber-1].add(value);
		}
				
		
		System.out.println("\n\nPrinting buckets before Sorting...");
		printBucket(buckets);
		
		
		//Sort Buckets
		for(ArrayList<Integer> bucket: buckets) {
			Collections.sort(bucket);
		}
		
		
		System.out.println("\n\nPrinting buckets after Sorting...");
		printBucket(buckets);
		
		
		//concatenate buckets
		int index=0;
		for(ArrayList<Integer> bucket: buckets) {
			for(int value: bucket) {
				arr[index] = value;
				index++;
			}
		}
	}//end of method 
	
}//end of class
