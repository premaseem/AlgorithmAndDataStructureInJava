package me.premaseem.datastructure.binaryTree.binaryTreeArray;

public class BinaryTreeArr {

    int[] a;
    int lui =0; // last used index

    public BinaryTreeArr(int size){
       a = new int[size +1];
    }

    public boolean insert(int v){
        if (lui >= a.length-1){
            System.out.println("cannot insert");
            return false;
        }
        a[++lui] = v;
        return true;
    }

    public int search(int v){
        for (int i = 1; i < lui; i++) {
            if(a[i] == v){
                return i;
            }
        }
        return -1;
    }

    public boolean delete(int v){
        int s = search(v);
        if(s != -1){
            a[s] = a[lui--];
            return true;
        }
            System.out.println("could not find element");
        return false;
    }

    public void pre(int i){
        if(i > lui){
            return;
        }
//        System.out.print("Pre order traversal ");
        System.out.print(" >> "+a[i]);
        pre(i*2);
        pre(i*2+1);
    }

    public void post(int i){
        if(i > lui){
            return;
        }
//        System.out.print("Post order traversal ");
        post(i*2);
        post(i*2+1);
        System.out.print(" >> "+a[i]);
    }

    public void in(int i){
        if(i > lui){
            return;
        }
//        System.out.print("In order traversal ");
        in(i*2);
        System.out.print(" >> "+a[i]);
        in(i*2+1);
    }

    public void level(int i){
        for (int j = i; j <=lui ; j++) {
            System.out.print(">> "+ a[j]);
        }
    }

}
