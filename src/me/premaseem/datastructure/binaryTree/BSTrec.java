package me.premaseem.datastructure.binaryTree;

// TODO
// Deletion
// Pretty Display

import org.junit.Test;

class N {
    N L,R;
    int v;
    public N(int e){v=e;}
}


public class BSTrec {

    N root;

    void insert(int e) {
        root = addRecursive(root, e);
    }

    Integer min(){

        if(root == null){
            return null;
        }

        N n = root;
        while(n.L != null ){
            n = n.L;
        }

        return n.v;
    }

    Integer minR(){
        return minr(root).v;
    }

    N minr(N n){
        if(n.L == null){
            return n;
        }
        return minr(n.L);
    }

    // Search Recursively
    N sR(N n, int e){
        if (n == null){
            return null;
        }
        if(e == n.v){
            return n;
        }
        if(e < n.v){
            return sR(n.L, e);
        } else
        if(e > n.v){
            return sR(n.R, e);
        }
      return null;
    }

    boolean sI(int e){
        N c = root;
        while (c != null){
            if(e == c.v){
                return true;
            }
            if( e < c.v){
                c = c.L;
            }else {
                c = c.R;
            }
        }
        return false;
    }

    N addRecursive(N n, int e) {
        if (n == null) {
            return new N(e);
        }
        if (e < n.v) {
            n.L = addRecursive(n.L, e);
        } else if (e > n.v) {
            n.R = addRecursive(n.R, e);
        }

        return n;
    }

    void display(){
        java.util.LinkedList<N> s = new java.util.LinkedList<>();
        s.push(root);
        int p = 0;
        int num = 0;
        while(!s.isEmpty()){
            N pop = s.pop();


            if(pop.L != null){
                s.push(pop.L);
            }
            if(pop.R != null){
                s.push(pop.R);
            }
            System.out.print(" >> " +pop.v);
            num++;
        }

    }

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        BSTrec t = new BSTrec();
        assert null == t.root;

        // validate value is inserted in root
        t.insert(50);
        assert t.root.v == 50;

        // validate value is inserted in root
        t.insert(60);
        assert t.root.R.v == 60;

        // validate value is inserted in root
        t.insert(40);
//        assert t.root.R.v == 40;


        t.insert(45);
        assert t.root.L.R.v == 45;

        assert 40 == t.min();
        assert 40 == t.minR();
        assert 40 == sR(t.root, 40).v;
        assert null == sR(t.root, 41);
        assert t.sI(40);
        t.display();
    }
}