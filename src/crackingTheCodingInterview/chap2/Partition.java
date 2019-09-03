package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

import java.util.List;

/**
 * ### Partition:
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x (see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1[partition=5]
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 *
 */

public class Partition {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        // input
        int[] in = {2, 4, 14, 5, 6, 6, 8, 2};
        MySLLNode head = new MySLLNode(in);

        solution1(head, 6);
        head.print();

    }

    // Basic solution
    private MySLLNode solution1(MySLLNode head, int partitionValue) {
        MySLLNode c =head;
        MySLLNode l = new MySLLNode(-1);
        MySLLNode r = new MySLLNode(-1);
        MySLLNode newHead = l;
        MySLLNode newHeadr = r;

        while(c.next != null){
            MySLLNode next = c.next;
            c.next = null;

            if(c.data < partitionValue){
                System.out.println(c.data + " adding to left");
                l.next = c;
                l =c;
            }else{
                System.out.println(c.data + " adding to right");
                r.next =c;
                r = c;
            }
            c = next;
        }

        newHead.print();
        newHeadr.print();
        l.next = newHeadr.next;

        return newHead.next;
    }

}
