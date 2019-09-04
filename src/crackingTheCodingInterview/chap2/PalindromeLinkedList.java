package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

/**
 * ### Palindrome:
 * Implement a function to check if a linked list is a palindrome.
 */
public class PalindromeLinkedList {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        // input
        int[] in = {1,2,3,3,2,1};
        MySLLNode head = new MySLLNode(in);
        assert solution1(head);

    }

    // Basic solution
    private boolean solution1(MySLLNode head) {
        if (head == null) {
            return false; // depends on our definition of a palindrome.
        }

        // slow and fast head
        MySLLNode slow =head , fast = head;

        while (fast!= null && fast.next!= null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        // reverse the linked list
        MySLLNode c = slow;
        MySLLNode p =null;
        MySLLNode n =null;

        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }

        MySLLNode middle = p;
        MySLLNode first = head;

        while(middle != null && first != null){
            if(middle.data != first.data){
                return false;
            }
            middle = middle.next;
            first = first.next;
        }

    return true;
    }
}
