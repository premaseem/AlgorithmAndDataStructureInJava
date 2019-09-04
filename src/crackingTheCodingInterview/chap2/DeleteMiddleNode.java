package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

/**
 * ### Delete Middle Node:
 * Implement an algorithm to delete a node in the middle
 * (i.e., any node but the first and last node, not necessarily the exact middle)
 * of a singly linked list, given only access to that node.
 *
 * EXAMPLE
 * lnput:the node c from the linked lista->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks likea->b->d->e- >f
 *
 */
public class DeleteMiddleNode {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        // input
        int[] in = {2, 4, 14, 5, 6, 6, 8, 2};
        MySLLNode head = new MySLLNode(in);

        // output
        assert  4 == solution1(head).data;

    }

    // Basic solution
    private MySLLNode solution1(MySLLNode head) {

        if(head.next != null){
            head.data = head.next.data;
            head.next = head.next.next;
        }

        return head;
    }

}
