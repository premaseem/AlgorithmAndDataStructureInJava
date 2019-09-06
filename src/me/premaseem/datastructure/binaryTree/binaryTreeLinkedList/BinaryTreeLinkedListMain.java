package me.premaseem.datastructure.binaryTree.binaryTreeLinkedList;

public class BinaryTreeLinkedListMain {

    public static void main(String[] args) {

        BinaryTreeLinkedList bt = new BinaryTreeLinkedList();
        for (int i = 1; i < 15; i++) {
            bt.insert(i);
        }

        bt.search(14);
        bt.search(34);
        bt.inLine(bt.root);
    }
}
