package codebase3.hashing;
import java.util.ArrayList;

public class LinearProbing {
	String[] hashTable;
	int noOfCellsUsedInHashTable;

	
	//Constructor
	LinearProbing(){
		hashTable = new String[13];
		noOfCellsUsedInHashTable = 0;
	}//end of method

	
	//HashFunction to be used on Keys
	public int simpleASCIIHashFunction(String x, int M) {
		char ch[];
		ch = x.toCharArray();
		int i, sum;
		for (sum=0, i=0; i<x.length(); i++) {
			sum = sum + ch[i];
		}
		//System.out.println("Index from hashfunction: " + sum % M);
		return sum % M;
	}//end of method
	
	
	//Returns LoadFactor of HashTable
	public double getLoadFactor() {
		double loadFactor = noOfCellsUsedInHashTable * 1.0 / hashTable.length;
		return loadFactor;
	}//end of method
	
	
	//Insert key in HashTable
	public void insertKeyInHashTable(String value) {
		double loadFactor = getLoadFactor();
		if (loadFactor >= 0.75) {	// we need to rehash in new table doubling the size
			System.out.println("Load factor of this HashTable has exceeded 0.75, hence we need to Rehash !\n");
			rehashKeys(value);
		} else {
			System.out.println("Inserting \"" + value + "\" in HashTable...");
			int index = simpleASCIIHashFunction(value, hashTable.length);
			for (int i = index; i < index + hashTable.length; i++) {
				int newIndex = i % hashTable.length;
				if (hashTable[newIndex] == null) { //If index is blank, then insert there
					hashTable[newIndex] = value;
					System.out.println("Index: " + newIndex + " is blank. Inserting there...");
					System.out.println("Successfully inserted " + "\"" + value + "\"" + " in location: " + newIndex);
					System.out.println("-------------------------------------------\n");
					break;
				}else {
					System.out.println("Index: " + newIndex + " is already occupied. Trying next empty cell...");
				}
			}//end of for loop
		}//end of if-else block
		noOfCellsUsedInHashTable++;
	}// end of method	
	
	
	//Creates a new HashTable and does ReHashing
	public void rehashKeys(String newStringToBeInserted) {
		noOfCellsUsedInHashTable = 0; //need to reset it as we are now dealing with fresh HashTable
		ArrayList<String> data = new ArrayList<String>();
		for (String s : hashTable) { //loop through the HashTable and save all the keys in ArrayList
			if (s != null)
				data.add(s);
		}
		data.add(newStringToBeInserted);
		hashTable = new String[hashTable.length * 2]; // make new table with double size
		for (String s : data) { // push all old data into new table
			insertKeyInHashTable(s);
		}
	}//end of method
	

	//Search for a given key in hashTable
	public boolean searchKeyInHashTable(String stringToBeSearched) {
		int index = simpleASCIIHashFunction(stringToBeSearched, hashTable.length);
		for (int i = index; i < index + hashTable.length; i++) {
			int newIndex = i % hashTable.length;
			if (hashTable[newIndex]!=null && hashTable[newIndex].equals(stringToBeSearched)) {
				System.out.println("\n" + "\"" + stringToBeSearched + "\"" + " found in HashTable at location: "+newIndex);
				return true;
			}
		}
		System.out.println("\n" + "\"" + stringToBeSearched + "\"" + " not found in HashTable.");
		return false;
	}//end of method

	
	//Delete key from HashTable
	public void deleteKeyFromHashTable(String stringToBeDeleted) {
		int index = simpleASCIIHashFunction(stringToBeDeleted, hashTable.length);
		for (int i = index; i < index + hashTable.length; i++) {
			int newIndex = i % hashTable.length;
			if (hashTable[newIndex]!=null && hashTable[newIndex].equals(stringToBeDeleted)) {
				hashTable[newIndex] = null;
				System.out.println("\n" + "\"" + stringToBeDeleted + "\"" + " has been found in HashTable." );
				System.out.println("\"" + stringToBeDeleted + "\"" + " has been deleted from HashTable !" );
				return;
			}
		}
		System.out.println("\nCould not find " + "\"" + stringToBeDeleted + "\"" + " in HashTable");
	}//end of method

	
	// Display the hash table
	public void displayHashTable() {
		if(hashTable == null) {
			System.out.println("\nHashTable does not exits !");
			return;
		}else {
			System.out.println("\n---------- HashTable ---------");
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println("Index:" + i + ".   Key:" + hashTable[i]);
			}
		}
		System.out.println("\n");
	}// end of method
	
	
	//Deletes entire HashTable
	public void deleteHashTable() {
		System.out.println("Successfully deleted HashTable !");
		hashTable = null;
	}//end of method
	
}//end of class
