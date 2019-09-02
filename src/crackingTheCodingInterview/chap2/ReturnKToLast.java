package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MyDLLNode;
import org.junit.Test;

/**
### Return Kth to Last:
Implement an algorithm to find the kth to last element of a singly linked list.

 */
public class ReturnKToLast {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] in = {2, 4, 4, 5, 9, 6, 8, 2};
        MyDLLNode head = new MyDLLNode(in);

        // get 3rd from last
        assert solution1(head,2).data == 8;
        assert solution2(head,2).data == 8;

    }

    // Basic solution
    private MyDLLNode solution1(MyDLLNode head, int k) {

        // count total number in one loop.
        // iterate for last - k to return element
        MyDLLNode c = head;
        int len = 0;
        while (c != null){
            len++;
            c = c.next;
        }

        System.out.println("the total leng is " + len);

        c = head;
        for (int i = 1; i <= len -k; i++) {
            c = c.next;
        }
            return c;
    }

    private MyDLLNode solution2(MyDLLNode head, int k) {
        MyDLLNode c = head;
        while (c.next != null){
            c = c.next;
        }

        for (int i = 1; i < k ; i++) {
            c = c.prev;
        }

        return c;
    }
}
