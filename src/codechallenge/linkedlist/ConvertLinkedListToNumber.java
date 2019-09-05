package codechallenge.linkedlist;

import me.premaseem.myLib.MySLLNode;
import org.junit.Test;

public class ConvertLinkedListToNumber {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        int[] n = new int[] { 6, 3, 4, 8, 2 };
        MySLLNode ll = new MySLLNode(n);
        assert 63482 == solution1(ll);
        assert 63482 == solution2(ll);

    }

    // Basic solution
    private int solution1(MySLLNode ll) {
        String ans = "";
        while(ll != null){
           ans += ll.data;
            ll= ll.next;
        }
        return Integer.parseInt(ans);
    }

    private int solution2(MySLLNode head) {
        int len=0;

        MySLLNode ll = head;
        while(ll != null){
            len++;
            ll= ll.next;
        }

        ll = head;
        int ans = 0;
        len--;
        while(ll != null){
            int n = (int) Math.pow(10,len--);
            ans += n * ll.data;
            ll= ll.next;
        }

        return ans;
    }

}
