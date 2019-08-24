package me.premaseem.datastructure.binaryTree;

import org.junit.Assert;
import org.junit.Test;

public class BST_2 {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        MyBST_2 t = new MyBST_2();
        assert null == t.root;

        // validate value is inserted in root
        t.insert(50);
        assert t.root.v == 50;

        // validate value is inserted in root
        t.insert(60);
        assert t.root.r.v == 60;

        // validate value is inserted in root
        t.insert(40);
        assert t.root.l.v == 40;


        t.insert(45);
        assert t.root.l.r.v == 45;


//        t.insert(60);
//        assert t.root.r.v == 60;
//
//        t.insert(35);
//        assert t.root.l.l.v == 35;
//
//        t.insert(25);
//        assert t.root.l.l.l.v == 25;



        t.insert(42);
        assert t.root.l.r.l.v == 42;



//        Assert.assertEquals(1, );

    }

    class Node {
        public Node(int e){
            v = e;
        }
        Node l,r;
        int v;
    }

    class MyBST_2 {

        Node root = null;

        void insert(int e){
            Node nn = new Node(e);
            if (null == root){
                root = nn;
                return;
            }

            // if value is smaller
            Node c = root;
            Node p;
//            while (true){
//                p = c;
//                if(e < c.v){
//                    c = c.l;
//                    if (c == null){
//                        p.l = nn;
//                        return;
//                    }
//                } else {
//                    c = c.r;
//                    if (c == null){
//                        p.r = nn;
//                        return;
//                    }
//                }
//
//
//            }


            while(true){
                p =c;
                if (e < c.v){
                    c = c.l;
                    if(c == null ){
                        p.l = nn;
                        return;
                    }
                } else {
                    c = c.r;
                    if(c == null ){
                        p.r = nn;
                        return;
                    }

                }


            }

        }


    }

}
