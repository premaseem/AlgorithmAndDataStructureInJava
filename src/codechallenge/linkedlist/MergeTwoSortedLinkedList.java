package codechallenge.linkedlist;

import me.premaseem.reusable.MySLLNode;
import org.junit.Test;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLinkedList {


    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        MySLLNode n1 = new MySLLNode(-100);
        MySLLNode n2 = new MySLLNode(0);
        MySLLNode n3 = new MySLLNode(100);
        MySLLNode n4 = new MySLLNode(250);

        MySLLNode m1 = new MySLLNode(-200);
        MySLLNode m2 = new MySLLNode(0);
        MySLLNode m3 = new MySLLNode(200);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        m1.next = m2;
        m2.next = m3;



        MySLLNode newHead = merge1(n1,m1);

        while(newHead.next != null){
            System.out.println(newHead.data + "< " + newHead.next.data);
            assert  newHead.data <= newHead.next.data;
            newHead = newHead.next;
        }


    }

    private MySLLNode merge1(MySLLNode n1, MySLLNode m1) {
        MySLLNode r1 = new MySLLNode(Integer.MAX_VALUE);
        MySLLNode rs = r1;

        while (n1 != null && m1 != null){

            if(n1.data < m1.data){
                r1.next = n1;
                n1= n1.next;
            }else {
                r1.next = m1;
                m1= m1.next;
            }
            r1 = r1.next;

        }

        if(n1 != null){
            r1.next = n1;
        }
        if(m1 != null){
            r1.next = m1;
        }

        return rs.next;
    }


}
