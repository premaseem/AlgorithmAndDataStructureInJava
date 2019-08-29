package codechallenge.linkedlist;

import me.premaseem.reusable.MyDLLNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*

Challenge: Reverse a doubly linked list

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

        MyDLLNode newHead = reverseLL(n1);

        while(newHead.next != null){
            System.out.println(newHead.data + "> " + newHead.next.data);
           assert  newHead.data > newHead.next.data;
           newHead = newHead.next;
        }

    }

    private MyDLLNode reverseLL(MyDLLNode n1) {
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


}

