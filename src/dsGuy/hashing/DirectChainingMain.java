package dsGuy.hashing;

public class DirectChainingMain {

	public static void main(String[] args) {

		// Constructor
		DirectChaining directChaining = new DirectChaining();

		directChaining.insertKeyInHashTable("The");
		directChaining.insertKeyInHashTable("quick");
		directChaining.insertKeyInHashTable("brown");
		directChaining.insertKeyInHashTable("fox");
		directChaining.insertKeyInHashTable("over");
		directChaining.insertKeyInHashTable("lazy");
		directChaining.displayHashTable();

		directChaining.insertKeyInHashTable("fox"); // use for showing collision
		directChaining.displayHashTable();

		directChaining.insertKeyInHashTable("fox"); 
		directChaining.displayHashTable();
		
		directChaining.insertKeyInHashTable("fox"); 
		directChaining.displayHashTable();
		
		directChaining.insertKeyInHashTable("fox"); 
		directChaining.displayHashTable();
		
		/*
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * 
		 * DirectChaining.searchKeyInHashTable("jump");
		 * DirectChaining.searchKeyInHashTable("brown");
		 * 
		 * 
		 * DirectChaining.deleteKeyFromHashTable("jump");
		 * DirectChaining.deleteKeyFromHashTable("quick");
		 * DirectChaining.displayHashTable();
		 * 
		 * 
		 * DirectChaining.deleteHashTable(); 
		 * DirectChaining.displayHashTable();
		 */

	}// end of method

}// end of class
