package codebase2.ds.heapimplementation;

public class Heap {
	private Node[] heapArray;
	private int maxSize; // size of the array
	private int currentSize; // number of nodes in the array
	
	public Heap(int size) {
		this.maxSize = size;
		currentSize = 0;
		heapArray = new Node[size]; // actually creates the array
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	
	public boolean insert(int key) {
		if(currentSize == maxSize) { // array is full
			return false;
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		
		trickleUp(currentSize);
		currentSize++;
		
		return true;
	}
	
	public void trickleUp(int idx) {
		int parentIdx = (idx-1)/2;
		Node nodeToInsert = heapArray[idx];
		
		// loop as long as we haven't reached the root and key of nodeToInsert's parent is less than new node
		while(idx > 0 && heapArray[parentIdx].getKey() < nodeToInsert.getKey()) {
			heapArray[idx] = heapArray[parentIdx]; // move parent down
			idx = parentIdx;
			parentIdx = (parentIdx -1)/2; // move up
		}
		heapArray[idx] = nodeToInsert;
	}
	
	public Node remove() {
		Node root = heapArray[0];
		currentSize--;
		heapArray[0] = heapArray[currentSize];
		
		trickleDown(0);
		
		return root;
	}
	
	private void trickleDown(int idx) {
		
		int largerChildIdx;
		Node top = heapArray[idx]; // save last into top variable
		
		// will run as long as idx is not on the bottom row (at least 1 child)
		while(idx < currentSize/2) {
			int leftChildIdx = 2*idx + 1; // left child idx position
			int rightChildIdx = leftChildIdx + 1; // right child idx position
			
			// figure out which child is larger
			if(rightChildIdx < currentSize && 
					heapArray[leftChildIdx].getKey() < heapArray[rightChildIdx].getKey()) {
				largerChildIdx = rightChildIdx;
			} else {
				largerChildIdx = leftChildIdx;
			}
			
			if(top.getKey() >= heapArray[largerChildIdx].getKey()) {
				// successfully made root the largest key
				break;
			}
			
			heapArray[idx] = heapArray[largerChildIdx];
			idx = largerChildIdx; // go down
			
		}
		heapArray[idx] = top;
		
	}
	
	public void displayHeap() {
		
		/** 
		
		You'll need to implement this method in the following assignment. I've provided 
		the solution at the end of the assignment but please don't just copy the solution. 
		Try to take the time and work on completing this method on your own before viewing
		the solution code. 
		
		This is an interesting and challenging programming problem to help you sharpen 
		your coding skills.
		
		*/
	}
	
}
