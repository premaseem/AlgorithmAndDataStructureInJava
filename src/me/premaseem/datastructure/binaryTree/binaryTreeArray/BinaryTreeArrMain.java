package me.premaseem.datastructure.binaryTree.binaryTreeArray;

public class BinaryTreeArrMain {


    public static void main(String[] args) {
        BinaryTreeArr bsta = new BinaryTreeArr(15);

        // insert
        for (int i = 1; i <=15 ; i++) {
            System.out.println("inserted " +bsta.insert(i));
        }


        // search
        System.out.println("search result "+bsta.search(3));
        System.out.println("search result "+bsta.search(17));

        // delete
//        System.out.println("delete result "+bsta.delete(7));
//        System.out.println("delete result "+bsta.delete(29));

        // pre order traversal
        bsta.pre(1);
        System.out.println();
        // In order traversal
        bsta.in(1);
        System.out.println();
        // Post order traversal
        bsta.post(1);
        System.out.println();
    }

}
