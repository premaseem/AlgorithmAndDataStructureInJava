package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

/**
 * ### Sum Lists:
 * You have two numbers represented by a linked list, where each node contains a single digit.The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input:(7-> 1 -> 6) + (5 -> 9 -> 2).Thatis,617 + 295. Output:2 -> 1 -> 9.Thatis,912.
 * <p>
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem. EXAMPLE
 * lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295. Output:9 -> 1 -> 2.Thatis,912.
 */
public class SumLists {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] n1 = new int[]{7, 1, 3};
        int[] n2 = new int[]{6, 3, 4, 8, 2};

        MySLLNode head1 = new MySLLNode(n1);
        MySLLNode head2 = new MySLLNode(n2);

        MySLLNode head3 = solution1(head1, head2);
        assert head3.toInt() == 64195;


    }

    // Basic solution
    private MySLLNode solution1(MySLLNode h1, MySLLNode h2) {
        // take pointer back if DLL else reverse it
        // start adding last digits and savce in new ll node;
        // take care of carry overs

        MySLLNode ans = null;
        MySLLNode newHead = null;

        h1 = h1.reverse();
        h2 = h2.reverse();


        int carry = 0;

        while (h1 != null || h2 != null || carry != 0) {
            int d = 0;

            if (h1 != null) {
                d += h1.data;
                h1 = h1.next;
            }

            if (h2 != null) {
                d += h2.data;
                h2 = h2.next;
            }

            if (carry != 0) {
                d += carry;
            }

            carry = d / 10;
            d = d % 10;
            MySLLNode nn = new MySLLNode(d);
            System.out.println(nn.data);
            nn.next = ans;
            ans = nn;
            newHead = nn;
        }

        return newHead;
    }

}
