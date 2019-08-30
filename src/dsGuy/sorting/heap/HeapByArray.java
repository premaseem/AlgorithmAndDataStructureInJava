package dsGuy.sorting.heap;

public class HeapByArray {
	int[] arr;
	int sizeOfTree;
	
	
	//Constructor
	public HeapByArray(int size) {
		//We are adding 1 here so that first cell of the array can be left blank all the time. This is eliminate problem of array starting from index 0.
		arr = new int[size+1];
		this.sizeOfTree = 0;
		System.out.println("Empty Heap has been created !");
	}//end of method

	
	public int sizeOfArray() {
		return arr.length;
	}
	
	
	public int sizeOfTree() {
		System.out.println("Size Of Tree: " + sizeOfTree);
		return sizeOfTree;
	}//end of method
	
	
	
	public boolean isHeapEmpty() {
		if (sizeOfTree <= 0) {
			System.out.println("Tree is empty !");
			return true;
		}else {
			System.out.println("Tree is not empty !");
			return false;
		}
	}//end of method
	
	
	
	public void deleteheap() {
		arr = null;
		System.out.println("Heap has been deleted !");
	}//end of method
	
	
	
	//Insert a new value in Heap
	public void insertInHeap(int value) {
		//Doing +1 because sizeOfTree always points to the last occupied cell of the array 
		System.out.println("Inserting " + value + " in Heap...");
		arr[sizeOfTree+1] = value;
		sizeOfTree++;
		HeapifyBottomToTop(sizeOfTree);
		System.out.println("Inserted " + value + " successfully in Heap !");
		levelOrder();
	}//end of method
	
	
	
	// Peek into Heap
	public void peek() {
		if(sizeOfTree == 0) {
			System.out.println("Heap is empty !");
		}else {
			System.out.println("Head of the Heap is: " + arr[1]);
		}
	}//end of method
	
	
	
	//Extract Head of Heap
	public int extractHeadOfHeap() {
		if(sizeOfTree == 0) {
			System.out.println("Heap is empty !");
			return -1;
		}else {
			System.out.println("Head of the Heap is: " + arr[1]);
			System.out.println("Extracting it now...");
			int extractedValue = arr[1];
			arr[1] = arr[sizeOfTree];
			sizeOfTree--;
			HeapifyTopToBottom(1);
			System.out.println("Successfully extracted value from Heap.");
			levelOrder();
			return extractedValue;
		}
	}//end of method
	

	
	
	public void HeapifyBottomToTop(int index) {
		int parent = index / 2;
		// We are at root of the tree. Hence no more Heapifying is required.
		if (index <= 1) {
			return;
		}
		// If Current value is smaller than its parent, then we need to swap
		if (arr[index] < arr[parent]) {
			int tmp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = tmp;
		}
		HeapifyBottomToTop(parent);
	}//end of method
	
	
	
	
	public void HeapifyTopToBottom(int index) {
		int left  = index*2;
		int right = (index*2)+1;
		int smallestChild = 0;
		
		if (sizeOfTree < left) { //If there is no child of this node, then nothing to do. Just return.
			return; 
		}else if (sizeOfTree == left) { //If there is only left child of this node, then do a comparison and return.
			if(arr[index] > arr[left]) {
				int tmp = arr[index];
				arr[index] = arr[left];
				arr[left] = tmp;
			}
			return;
		}else { //If both children are there
			if(arr[left] < arr[right]) { //Find out the smallest child
				smallestChild = left;
			}else {
				smallestChild = right;
			}
			if(arr[index] > arr[smallestChild]) { //If Parent is greater than smallest child, then swap
				int tmp = arr[index];
				arr[index] = arr[smallestChild];
				arr[smallestChild] = tmp;
			}
		}
		HeapifyTopToBottom(smallestChild);
	}//end of method
	
	
	
	public void levelOrder() {
		System.out.println("Printing all the elements of this Heap...");// Printing from 1 because 0th cell is dummy
		for (int i = 1; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}//end of method
	
	
}//end of class	

