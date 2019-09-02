package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * ### Remove Dups!
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class RemoveDuplicates {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        // input
        int[] in = {2, 4, 4, 5, 6, 6, 8, 2};
        MySLLNode head = new MySLLNode(in);

        // output
//        MySLLNode headOut = solution1(head);
        MySLLNode headOut = solution2(head);

        // testing
        int[] exp = {2, 4, 5, 6, 8};
        MySLLNode headExp = new MySLLNode(exp);

        while (headExp != null && headOut != null) {
            assert headExp.data == headOut.data;
            headExp = headExp.next;
            headOut = headOut.next;
        }

    }

    // Basic solution
    private MySLLNode solution1(MySLLNode head) {
        Set<Integer> exists = new HashSet<>();
        MySLLNode c = head;
        MySLLNode p = null;
        while (c != null) {
            if (!exists.contains(c.data)) {
                exists.add(c.data);
                p = c;
            } else {
                p.next = c.next;
            }

            c = c.next;
        }
        return head;
    }

    private MySLLNode solution2(MySLLNode head) {
        Set<Integer> exists = new HashSet<>();
        MySLLNode c = head;
        exists.add(head.data);
        while (c.next != null) {
            if (!exists.contains(c.next.data)) {
                exists.add(c.next.data);
                c = c.next;
            } else {
                c.next = c.next.next;
            }
        }
        return head;
    }
}
