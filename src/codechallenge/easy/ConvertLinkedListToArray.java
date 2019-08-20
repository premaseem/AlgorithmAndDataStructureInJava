package codechallenge.easy;

import org.junit.Test;

import java.util.LinkedList;

/*
Convert Linked list into Array
 */
public class ConvertLinkedListToArray {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        LinkedList<String> ll = new LinkedList();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("last");


        String[] arr = convert(ll);
        assert 4 == arr.length;
        assert "first" == arr[0];
        assert "last" == arr[3];

    }

    String[] convert(LinkedList<String> ll) {
        String[] arr = new String[ll.size()];
        int i = 0;
        for (String s : ll) {
            arr[i++] = s;
        }
        return arr;
    }


}
