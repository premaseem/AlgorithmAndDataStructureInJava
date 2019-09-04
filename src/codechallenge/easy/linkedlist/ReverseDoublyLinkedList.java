package codechallenge.easy.linkedlist;

import me.premaseem.myLib.MyDLLNode;
import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

public class ReverseDoublyLinkedList {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] ll = {1, 2, 3, 4, 5};
        int[] rll = {5, 4, 3, 2, 1};


        MyDLLNode headd = new MyDLLNode(ll);
        MyDLLNode revHeadd = new MyDLLNode(rll);
        MyDLLNode outputHeadd = solution2(headd);

        while (outputHeadd != null && revHeadd != null) {

            assert outputHeadd.data == revHeadd.data;
            outputHeadd = outputHeadd.next;
            revHeadd = revHeadd.next;
        }
    }



    private MyDLLNode solution2(MyDLLNode head) {
        MyDLLNode newHead = null;
        MyDLLNode current = head;
        MyDLLNode next = null;
        MyDLLNode prev = null;

        while(current != null){
            newHead = current;
            next = current.next;
            prev = current.prev;
            current.next = prev;
            current.prev = next;
            current = next;
        }


        return newHead;
    }

}
