package codechallenge.easy.linkedlist;

import me.premaseem.myLib.MyDLLNode;
import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

public class ReverseSinglyLinkedList {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] ll = {1, 2, 3, 4, 5};
        int[] rll = {5, 4, 3, 2, 1};

        MySLLNode head = new MySLLNode(ll);
        MySLLNode revHead = new MySLLNode(rll);
        MySLLNode outputHead = solution1(head);


        while (outputHead != null && revHead != null) {

            assert outputHead.data == revHead.data;
            outputHead = outputHead.next;
            revHead = revHead.next;
        }
    }

    // Basic solution
    private MySLLNode solution1(MySLLNode head) {

        MySLLNode current = head;
        MySLLNode next = null;
        MySLLNode prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }



}
