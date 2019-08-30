package eliminateCodeFear.datastructures.binaryTree;

import java.util.Set;
import java.util.TreeSet;

public class BinaryTreeByArray {
	int [] arr;
	int lastUsedIndex;
	
	Set<Integer> a =  new TreeSet();
	//Constructor for blank Tree
	public BinaryTreeByArray(int size) {
		arr = new int[size+1];
		this.lastUsedIndex = 0; 	
		System.out.println("Blank Tree of size " +size+ " has been created !\n");
	}//end of method

	
	//Check if array is full
	boolean isTreeFull(){
		if(arr.length-1 == lastUsedIndex) {
			return true;
		}else {
			return false;
		}
	}
	
	
	// New node should be inserted at the first empty place in the array
	void insert(int value) {
		if(!isTreeFull()) {
			arr[lastUsedIndex+1] = value;
			lastUsedIndex++;
			System.out.println("Successfully inserted "+value+ " in the tree!");
		}else {
			System.out.println("Could not insert value in the Tree as it is full !");
		}
	}//end of method
	

	//level-Order traversal of binary tree
	public void levelOrder() {
		for(int i=1;i<=lastUsedIndex;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}//end of method
	
	
	// Pre-Order traversal of binary tree
	public void preOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + " ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}//end of method
	
	
	// Post-Order Traversal of binary tree
	void postOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		postOrder(index * 2);
		postOrder(index * 2 + 1);
		System.out.print(arr[index] + " ");
	}//end of method

	
	// In-Order Traversal of binary tree
	void inOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		inOrder(index * 2);
		System.out.print(arr[index] + " ");
		inOrder(index * 2 + 1);
	}//end of method
	
	
	// Do a linear search on the array 
	public int search(int value) {
		for (int i = 0; i <= lastUsedIndex; i++) {
			if (arr[i] == value) {
				System.out.print(value +" exists in the Tree! ");
				System.out.println("It is at the location: " + i);
				return i;
			}
		}
		System.out.println(value + " does not exists in Tree !");
		System.out.println();
		return -1;
	}//end of method
		
	
	// delete operation of binary tree
	public void delete(int value) {
		int location = search(value);
		//If Value does not exists in Array
		if (location == -1) {
			return;
		}else {
			//insert last element of the Tree into current location
			arr[location] = arr[lastUsedIndex];
			lastUsedIndex--;
			System.out.println("Successfully deleted " + value + " from the Tree !");
		}	
	}//end of method
	
	
	public void deleteTree(){
		try {
			arr = null;
			System.out.println("Tree has been deleted successfully !");
		}catch(Exception e){
			System.out.println("There was an error deleting the tree.");
		}
	}//end of method
	
}//end of class
