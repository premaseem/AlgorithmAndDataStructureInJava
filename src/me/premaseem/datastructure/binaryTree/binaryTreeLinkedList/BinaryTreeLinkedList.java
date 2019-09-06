package me.premaseem.datastructure.binaryTree.binaryTreeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

class N{
    N l,r;
    int v;

    public N(int v){
        this.v = v;
    }
}


public class BinaryTreeLinkedList {

    N root = null;


    public boolean delete(int v){
        // search if element exists by level order traversal
        N target = search(v);
        if (target == null){
            return false;
        }
        // find replacement node from deepest level
        Queue<N> q = new LinkedList<N>();
        q.add(root);
        N p = null;
        N parent = null;
        while(!q.isEmpty()){
            p = q.remove();
            parent = p;
            if(p.l != null){
                q.add(p.l);
            }
            if(p.r != null){
                q.add(p.r);
            }
        }

        // now p is the last element, replace it with node to delete

        target.v = p.v;
        deleteDeepestNode();

        // replace it and you are done

        return true;
    }

    void deleteDeepestNode(){
        Queue<N> q = new LinkedList<N>();
        q.add(root);
        N prv, pst;
        while(!q.isEmpty()){
           pst = q.remove();
           prv = pst;
           if(pst.l == null){
               prv.r = null;
           }
           if(pst.r == null){
               pst.l = null;
           }
           q.add(pst.l);
           q.add(pst.r);
        }
    }

    public  N search(int v){
        Queue<N> q = new LinkedList<N>();
        q.add(root);
        while(!q.isEmpty()){
            N p = q.remove();
            if( p.v == v ){
                System.out.println("found "+ v);
                return p;
            }else {
                if(p.l != null){
                    q.add(p.l);
                }
                if(p.r != null){
                    q.add(p.r);
                }
            }
        }
        System.out.println("Not found "+ v);
        return null;
    }

    public void insert(int v){
        N nn = new N(v);
        if (root == null){
            root = nn;
            System.out.println("setting root node ");
            return;
        }
        Queue<N> q = new LinkedList<N>();
        q.add(root);

        while (!q.isEmpty()){
            N p = q.remove();
            if (p.l == null){
                p.l = nn;
                System.out.println("setting left node ");
                break;
            } else if (p.r == null){
                p.r = nn;
                System.out.println("setting right node ");
                break;
            }else {
                q.add(p.l);
                q.add(p.r);
            }
        }
    }

    // level order traversal
    public void level(N n){

        Queue<N> q = new LinkedList<N>();
        q.add(root);
        while (! q.isEmpty()){

            N p = q.remove();
            System.out.print(" >> "+p.v);

            if(p.l != null){
                q.add(p.l);
            }

            if(p.r != null){
                q.add(p.r);
            }
        }
    }

    public void inLine(N n){
        if (n == null){
            return;
        }
        inLine(n.l);
        System.out.print(" >> "+n.v);
        inLine(n.r);
    }

    public void pre(N n){
        if (n == null){
            return;
        }
        System.out.print(" >> "+n.v);
        pre(n.l);
        pre(n.r);
    }

    public void post(N n){
        if (n == null){
            return;
        }
        post(n.l);
        post(n.r);
        System.out.print(" >> "+n.v);
    }



}

//>> 8 >> 4 >> 9 >> 2 >> 10 >> 5 >> 11 >> 1 >> 12 >> 6 >> 13 >> 3 >> 14 >> 7
// 8 4 9 2 10 5 11 1 12 6 13 3 14 7 15
// 8 4 9 2 10 5 1 6 3 7
// 8 4 9 2 10 5 1 6 3 7
// >> 2 >> 4 >> 8 >> 9 >> 5 >> 10 >> 11 >> 1 >> 3 >> 6 >> 12 >> 13 >> 7 >> 14 >> 15
