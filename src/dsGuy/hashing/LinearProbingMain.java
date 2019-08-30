package dsGuy.hashing;

public class LinearProbingMain {
	public static void main(String[] args) {
		
		//Constructor
		LinearProbing linearProbing = new LinearProbing();


		linearProbing.insertKeyInHashTable("The");
		linearProbing.insertKeyInHashTable("quick");
		linearProbing.insertKeyInHashTable("brown");
		linearProbing.insertKeyInHashTable("fox");
		linearProbing.insertKeyInHashTable("over");
		linearProbing.insertKeyInHashTable("lazy");
		linearProbing.displayHashTable();
		
		linearProbing.insertKeyInHashTable("fox"); //use for showing collision
		linearProbing.displayHashTable();
				
		/*linearProbing.insertKeyInHashTable("fox");
		linearProbing.displayHashTable();
		
		linearProbing.insertKeyInHashTable("fox");
		linearProbing.displayHashTable();
		
		linearProbing.insertKeyInHashTable("fox");
		linearProbing.displayHashTable();
		
		linearProbing.insertKeyInHashTable("fox");
		linearProbing.displayHashTable();
		
		
		linearProbing.searchKeyInHashTable("jump");
		linearProbing.searchKeyInHashTable("brown");
		
		
		linearProbing.deleteKeyFromHashTable("jump");
		linearProbing.deleteKeyFromHashTable("quick");
		linearProbing.displayHashTable();
		
		
		linearProbing.deleteHashTable();
		linearProbing.displayHashTable();
*/		
				
	}//end of method

}//end of class
