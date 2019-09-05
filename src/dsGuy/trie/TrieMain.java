package dsGuy.trie;

public class TrieMain {

	public static void main(String[] args) {
		Trie t  =new Trie();
		
		//CASE#1
		t.insert("bcde");
		t.insert("bckg");
		t.delete("bcde");
		t.search("bcde");
		t.search("bckg");
		
		
		/*//CASE#2
		t.insert("bcde");
		t.insert("bcdefg");
		t.delete("bcde");
		t.search("bcde");
		t.search("bcdefg");*/
		
		
		/*//CASE#3
		t.insert("bcde");
		t.insert("bc");
		t.delete("bcde");
		t.search("bcde");
		t.search("bcde");
		t.search("bc");
		t.search("b");*/
		
		
		/*//CASE#4
		t.insert("bcde");
		t.delete("bcde");
		t.search("bcde");*/
		
	}

}//End of Class