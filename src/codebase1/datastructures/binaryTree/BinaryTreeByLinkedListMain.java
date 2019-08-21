package codebase1.datastructures.binaryTree;

public class BinaryTreeByLinkedListMain {

	public static void main(String[] args) {
		
		
		//Create a blank Tree
		BinaryTreeByLinkedList tree = new BinaryTreeByLinkedList();
		
		
		//Insert 10 nodes in the tree
		System.out.println("Inserting 10 nodes to tree");
		for(int i=1;i<=10;i++)
			tree.insert(i*10);
		
		
		System.out.println("\nLevel-order of tree:");
		tree.levelOrder();
		System.out.println();
		
		
		System.out.println("\nPre-order of tree:");
		tree.preOrder(tree.root);
		System.out.println();
		
		
		System.out.println("\nPost-order of tree:");
		tree.postOrder(tree.root);
		System.out.println();
		
		
		System.out.println("\nIn-order of tree:");
		tree.inOrder(tree.root);
		System.out.println();
		
		
		System.out.println("\nSearching node 50 in the tree...");
		tree.search(50);
		
		
		System.out.println("\nSearching node 500 in the tree...");
		tree.search(500);
		
		
		System.out.println("\nDeleting node having value-5 in the tree...");
		tree.deleteNodeOfBinaryTree(5);
		
		
		System.out.println("\nDeleting node having value-50 in the tree...");
		tree.deleteNodeOfBinaryTree(50);
		tree.levelOrder();
		
		System.out.println("\n\nDeleting node having value-10 in the tree...");
		tree.deleteNodeOfBinaryTree(10);
		tree.levelOrder();
		
		System.out.println("\n\nDeleting node having value-80 in the tree...");
		tree.deleteNodeOfBinaryTree(80);
		tree.levelOrder();
		
		
		System.out.println("Deleting the entire Tree");
		tree.deleteTree();
				
	}

}
