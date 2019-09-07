package me.premaseem.datastructure.binarySearchTree;


class Node {
    Node left, right;
    int data;

    public Node(int d) {
        data = d;
    }

}

public class BinarySearchTree {

    Node root;
    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

//      print inorder traversal of the BST
        tree.inOrder();

        tree.search(100);
        tree.search(30);

        tree.delete(30);
        tree.delete(30);
        tree.delete(50);

        System.out.println();
        tree.inOrder();
    }

    private void delete(int d) {
        root = deleteR(root,d);
    }

    private Node deleteR(Node n ,int d) {
        if(n == null){
            return n;
        }
        if(d < n.data){
            n.left = deleteR(n.left,d);
        }else if(d > n.data){
            n.right = deleteR(n.right,d);
        } else {
            // 1 or all nodes are null
            if(n.left == null){
                return n.right;
            }else if (n.right == null){
                return n.left;
            }

            n.data = findMin(n.right);
            n.right = deleteR(n.right,n.data);
            // if both node are not null
        }
        return n;

    }

    int findMin(Node n){
        int min = n.data;
        if(n.left != null){
            min = n.data;
            n = n.left;
        }
        return min;
    }


    private void insert(int d) {
        root = insertR(root,d);
    }

    private Node insertR(Node n ,int d) {
        if(n == null){
            return new Node(d);
        }
        if(d < n.data){
            n.left = insertR(n.left, d);
        }else {
            n.right = insertR(n.right, d);
        }
        return n;
    }


    void inOrder(){
        inOrderR(root);
    }

    private void inOrderR(Node n) {
        if(n == null){
            return;
        }
        inOrderR(n.left);
        System.out.print(" >> "+ n.data);
        inOrderR(n.right);
    }


    void search(int d){
        searchR(root, d);
    }

    private void searchR(Node n, int d) {
        if(n == null){
            System.out.println("not found ");
            return;
        }

        if(d == n.data){
            System.out.println("Element found :-) ");
            return;
        }
        if(d < n.data){
            searchR(n.left, d);
        }else {
            searchR(n.right,d);
        }

    }
}
