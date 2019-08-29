package codechallenge.linkedlist;

import me.premaseem.reusable.MyDLLNode;
import org.junit.Test;

/*

Challenge: Inserting a Node Into a Sorted Doubly Linked List
 1. Empty list
 2. At the beginning of the list
 3. Somewhere at the middle of the list
 4. At the end of the list
 */


public class InsertNodeInSortedLL {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        MyDLLNode n1 = new MyDLLNode(-100);
        MyDLLNode n2 = new MyDLLNode(0);
        MyDLLNode n3 = new MyDLLNode(70);
        MyDLLNode n4 = new MyDLLNode(10000);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        sortedInsert(n1, 250);
        assert n3.next.data == 250;
        assert n4.prev.data == 250;

        sortedInsert(n1, 250000);
        assert n4.next.data == 250000;

    }


    // Using Recursion
    MyDLLNode sortedInsertR(MyDLLNode head, int data) {
        if (head == null) {
            return new MyDLLNode(data);
        } else if (data <= head.data) {
            MyDLLNode n = new MyDLLNode(data);
            n.next = head;
            head.prev = n;
            return n;
        } else {
            MyDLLNode rest = sortedInsert(head.next, data);
            head.next = rest;
            rest.prev = head;
            return head;
        }
    }

    // Using Greedy algorithm
    MyDLLNode sortedInsert(MyDLLNode head, int data) {
        MyDLLNode nn = new MyDLLNode(data);
        if (head == null) {
            return nn;
        }
        MyDLLNode cn = head;

        while(cn.next != null && cn.data < data){
            cn = cn.next;
        }

        if(head == cn){
            nn.next = cn;
            cn.prev = nn;
            return nn;
        }

        if(cn.data<data){
            cn.next = nn;
            nn.prev = cn;
        }else{
            nn.next = cn;
            nn.prev = cn.prev;
            cn.prev.next = nn;
            cn.prev = nn;
        }

        return head;

    }
}

