package crackingTheCodingInterview.chap2;

import me.premaseem.myLib.MyDLLNode;
import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

/**
 * ### Remove Dups!
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class RemoveDuplicatesFollowup {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        // input
        int[] in = {2, 4, 4, 5, 6, 6, 8, 2};
        MySLLNode head = new MySLLNode(in);

        // output
        MySLLNode headOut = solution1(head);

        // testing
        int[] exp = {2, 4, 5, 6, 8};
        MySLLNode headExp = new MySLLNode(exp);

        while (headExp != null && headOut != null) {
            assert headExp.data == headOut.data;
            headExp = headExp.next;
            headOut = headOut.next;
        }

        // input
        int[] inD = {2, 4, 4, 5, 6, 6, 8, 2};
        MyDLLNode headD = new MyDLLNode(inD);

        // output
        MyDLLNode headOutD = solution2(headD);

        // testing
        int[] expD = {2, 4, 5, 6, 8};
        MyDLLNode headExpD = new MyDLLNode(expD);

        while (headExpD != null && headOutD != null) {
            assert headExpD.data == headOutD.data;
            headExpD = headExpD.next;
            headOutD = headOutD.next;
        }

    }

    // Basic solution
    private MySLLNode solution1(MySLLNode head) {

        MySLLNode co = head;

        // outer
        while(co != null){

            MySLLNode pi = co;
            MySLLNode ci = co.next;

            // inner
            while(ci != null){
                if(ci.data == co.data){
                    pi.next = ci.next;
                } {
                    pi = ci;
                }
                ci = ci.next;
            }

            co = co.next;
        }

        return head;
    }

    private MyDLLNode solution2(MyDLLNode head) {

        MyDLLNode co = head;
        // outer
        while(co != null){
            MyDLLNode ci = co.next;

            // inner loop
            while (ci != null) {
                // jumping
                if(co.data == ci.data){
                    ci.prev.next = ci.next;
                    if(ci.next !=null){
                        ci.next.prev = ci.prev;
                    }
                }

                ci = ci.next;
            }
            co = co.next;
        }
        return head;
    }
}
