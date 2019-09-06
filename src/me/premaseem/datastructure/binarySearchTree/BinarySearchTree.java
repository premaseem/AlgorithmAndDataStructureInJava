package me.premaseem.datastructure.binarySearchTree;

class N {
    N l, r;
    int v;

    public N(int v) {
        this.v = v;
    }
}

public class BinarySearchTree {

    N root;

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

        // print inorder traversal of the BST
        tree.inorder();

        tree.search(70);
        tree.search(700);
        tree.deleteN(30);
        tree.deleteN(31);
        tree.deleteN(70);
        tree.inorder();
    }

    private void deleteN(int v) {
        root = deleteR(root,v);
    }

    private N deleteR(N n, int v) {
        if(n == null){
            System.out.println("cannot delete, item not found");
            return n;
        }

        if (v < n.v){
            n.l = deleteR(n.l, v);
        } else
        if (v > n.v){
            n.r = deleteR(n.r, v);
        }

        // if we are here, this means we have identified the note to delete
        else{

            // 1 child or less child
            if(n.l == null){
                return n.r;
            }
            if(n.r == null){
                return n.l;
            }
            // 2 childs
                n.v = minVal(n.r); // get min value from right side and remove that node
                deleteR(n.r,n.v);
        }

        return n;
    }

    int minVal(N n){
        int minV = n.v;
        while(n.l != null){
            minV = n.l.v;
            n = n.l;

        }
        return minV;
    }

    private void search(int v) {
        searchRec(root, v);
    }

    private void searchRec(N n, int v) {

        if (n == null) {
            System.out.println("not found");
            return;
        }

        if (n.v == v) {
            System.out.println("Found");
        }
        if (v < n.v) {
            searchRec(n.l, v);
        } else if (v > n.v) {
            searchRec(n.r, v);
        }
    }

    void inorder() {
        System.out.println("printing in order BST in sorted order ");
        inorderRec(root);

    }

    void inorderRec(N n) {
        if (n != null) {
            inorderRec(n.l);
            System.out.print(" >> " + n.v);
            inorderRec(n.r);
        }
    }

    private void insert(int v) {
        root = insert(root, v);

    }

    private N insert(N n, int v) {
        if (n == null) {
            return new N(v);
        }
        if (v < n.v) {
            n.l = insert(n.l, v);
        } else if (v > n.v) {
            n.r = insert(n.r, v);
        }
        return n;
    }


}
