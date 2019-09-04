package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * ### Palindrome:
 * Implement a function to check if a linked list is a palindrome.
 */
public class PalindromeLinkedList {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        // input
        int[] in = {5, 4, 3, 1};
        MySLLNode head = new MySLLNode(in);
        assert solution1(head);

    }

    // Basic solution
    private boolean solution1(MySLLNode head) {
        if (head == null) {
            return false; // depends on our definition of a palindrome.
        }

//        // Reverse 2nd half of list
//        MySLLNode slow = head;
//        MySLLNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        if (fast != null) { // for lists with odd # of Nodes
//            slow = slow.next;
//        }
//        MySLLNode slowCenter = ListFunctions.reverseListIterative(slow);
//
//        // compare 1st half of list to 2nd half
//        MySLLNode slowFront = head;
//        ListFunctions.printList(slowFront);
//        ListFunctions.printList(slowCenter);
//
//        while (slowCenter != null) {
//            if (slowCenter.data != slowFront.data) {
//                return false;
//            }
//            slowFront = slowFront.next;
//            slowCenter = slowCenter.next;
//        }
//        return true;
//    }
    return true;
    }
}
