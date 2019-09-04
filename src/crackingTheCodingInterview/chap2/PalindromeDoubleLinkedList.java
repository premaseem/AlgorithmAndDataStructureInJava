package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MyDLLNode;
import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

/**
 * ### Palindrome:
 * Implement a function to check if a linked list is a palindrome.
 */
public class PalindromeDoubleLinkedList {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        // input
        int[] in = {1,2,3,3,2,1};
        MyDLLNode head = new MyDLLNode(in);
        assert solution1(head);

    }

    // Basic solution
    private boolean solution1(MyDLLNode head) {
        if (head == null) {
            return false; // depends on our definition of a palindrome.
        }
        MyDLLNode c = head;
        while(c.next != null){
            c = c.next;
        }
        MyDLLNode tail = c;
        MyDLLNode fast = head;

        int count = 0;
        // find out tail and iterate it till half of the time
        while(head != null && tail != null && fast!= null && fast.next != null){
            if (head.data != tail.data){
                return false;
            }

            head = head.next;
            tail = tail.prev;
            fast = fast.next.next;
            System.out.println(count++);
        }


    return true;
    }
}
