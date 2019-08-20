package me.premaseem.datastructure.binaryTree;

public class Test {
    BST bst = new BST();

    @org.junit.Test
    public void testInsert(){
        bst.insert(10);
        bst.insert(20);
        bst.insert(50);
        bst.insert(5);

        int min = bst.searchMin();
        int max = bst.searchMax();

        assert min == 5;
        assert max == 50;
        bst.printBST(bst.root);

        bst.deleteNode(5);

        bst.printBST(bst.root);
    }
}
