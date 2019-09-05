package dsGuy.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	// Private class
	private class TrieNode {
		Map<Character, TrieNode> children;
		boolean endOfWord;

		// Constructor
		public TrieNode() {
			children = new HashMap<>();
			endOfWord = false;
		}
	}// End of inner class

	private final TrieNode root;

	
	// Constructor
	public Trie() {
		root = new TrieNode();
	}

	
	// Insert word into Trie
	public void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		current.endOfWord = true;
		System.out.println("Successfully inserted " + word + " in Trie !");
	}

	
	// Search for a word in Trie
	public boolean search(String word) {
		TrieNode currentNode = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = currentNode.children.get(ch); 
			if (node == null) { //CASE#1 -- if node does not exist for given char then return false
				System.out.println("Word: " + word + " does not exists in Trie !");
				return false;
			}
			currentNode = node;
		}
		if(currentNode.endOfWord == true) {
			System.out.println("Word: " + word + " exists in Trie !"); //CASE#2 -- Word exists in Trie
		}else {//CASE#3 -- Current word is a prefix of another word. But this word does not exists
			System.out.println("Word: " + word + " does not exists in Trie ! But this is a Prefix of another Word !");
		}
		return currentNode.endOfWord;
	}

	
	// Delete word from Trie
	public void delete(String word) {
		if (search(word) == true) {
			delete(root, word, 0);
		}
	}

	
	
	
	// Returns true if parent should delete the mapping
	private boolean delete(TrieNode parentNode, String word, int index) {
		
		// CASE#1 -- Some other word's prefix is same as Prefix of this word (BCDE, BCKG)
		// CASE#2 -- We are at last character of this word and This word is a Prefix of some other word (BCDE, BCDEFG)
		// CASE#3 -- Some other word is a Prefix of this word (BCDE, BC)
		// CASE#4 -- No one is dependent on this Word (BCDE, BCDE)
		
		char ch = word.charAt(index);
		TrieNode currentNode = parentNode.children.get(ch);

		boolean canThisNodeBeDeleted;

		if (currentNode.children.size() > 1) {
			System.out.println("Entering Case#1");
			delete(currentNode, word, index + 1); // CASE#1
			return false;
		}

		

		if (index == word.length() - 1) { // CASE#2
			System.out.println("Entering Case#2");
			if (currentNode.children.size() >= 1) {
				currentNode.endOfWord = false;//updating endOfWord will signify that this word is not there in Trie
				return false;
			} else {
				System.out.println("Character " + ch + " has no dependency, hence deleting it from last");
				parentNode.children.remove(ch);
				return true;// If this word is not a prefix of some other word, and since this is last
							// character, we should
							// return true, indicating we are ok to delete this node
			}
		}
		
		
		if (currentNode.endOfWord == true) { // CASE#3
			System.out.println("Entering Case#3");
			delete(currentNode, word, index + 1); 
			return false;
		}
		
		
		System.out.println("Entering Case#1");
		canThisNodeBeDeleted = delete(currentNode, word, index + 1); // CASE#4
		if (canThisNodeBeDeleted == true) {
			System.out.println("Character " + ch + " has no dependency, hence deleting it");
			parentNode.children.remove(ch);
			return true; // Current node can also be deleted
		} else {
			return false; // Someone is dependent on this node, hence dont delete it
		}

	}

}// End of class