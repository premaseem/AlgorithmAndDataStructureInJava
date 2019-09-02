package codechallenge.linkedlist;

import me.premaseem.myLib.MyDLLNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*

Challenge: Reverse a doubly linked list

     * For your reference:
     *
     * MyDLLNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *


 */


public class ReverseDoublyLinkedlist {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        MyDLLNode n1 = new MyDLLNode(-100);
        MyDLLNode n2 = new MyDLLNode(0);
        MyDLLNode n3 = new MyDLLNode(100);
        MyDLLNode n4 = new MyDLLNode(250);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        MyDLLNode newHead = reverse1(n1);

        while(newHead.next != null){
            System.out.println(newHead.data + "> " + newHead.next.data);
           assert  newHead.data > newHead.next.data;
           newHead = newHead.next;
        }

        newHead = reverse2(n1);

        while(newHead.next != null){
            System.out.println(newHead.data + "< " + newHead.next.data);
            assert  newHead.data < newHead.next.data;
            newHead = newHead.next;
        }

    }

    // solution 1
    private MyDLLNode reverse1(MyDLLNode n1) {
        List<MyDLLNode> al = new ArrayList<>();
        while(n1 != null){
            al.add(n1);
            n1 = n1.next;
        }

        for (int i = al.size()-1; i > 0; i--) {
            al.get(i).next = al.get(i-1);
            al.get(i-1).prev = al.get(i);
        }
        al.get(al.size()-1).prev = null;
        al.get(0).next = null;
        return al.get(al.size()-1);
    }


    // solution 2
    private  MyDLLNode reverse2(MyDLLNode head) {
        MyDLLNode prev = null, cur = head, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            cur.prev = next;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    // solution 3 - incomplete
    private  MyDLLNode reverse3(MyDLLNode head) {

        MyDLLNode cn = head;
        MyDLLNode revHead = cn;
        while(cn != null){

            System.out.println(cn.data);
            cn.prev = cn.next;
            cn = cn.next;
//            System.out.println("next" + head.data);
        }

        cn = head;
        while (cn != null){
            revHead = cn;
            cn.next = cn.prev;
            System.out.println(cn.data);
            cn = cn.prev;
        }

        cn = revHead;
        while (cn != null){
//            cn.next = cn.prev;
            System.out.println(cn.data);
            cn = cn.next;
        }


//        MyDLLNode newHead = head;
//        while(head.prev != null){
//            head.next = head.prev;
//            head = head.prev;
//        }
        return revHead;

    }
}

