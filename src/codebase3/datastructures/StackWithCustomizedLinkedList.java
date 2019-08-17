package codebase3.datastructures;


// Test Driven Development by Aseem Jain

import org.junit.Test;


class StackNode<E> {
    public StackNode(E e) {
        this.data = e;
    }

    E data;
    StackNode next;

}


public class StackWithCustomizedLinkedList<E> {

    StackNode top = null;


    boolean isEmpty() {
        return top == null;
    }

    void push(E e) {
        StackNode t = new StackNode(e);
        t.next = top;
        top = t;
    }

    E pop() {
        StackNode t = top;
        if (top != null) {
            top = top.next;
        }
        return (E) t.data;
    }

    boolean search(E e) {
        StackNode t = top;
        while (t != null) {
            if (t.data == e)
                return true;
            t = t.next;
        }

        return false;
    }

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        StackWithCustomizedLinkedList<Integer> sa = new StackWithCustomizedLinkedList();
        assert sa.isEmpty();

        sa.push(7);
        sa.push(9);
        assert !sa.isEmpty();
        assert sa.search(7);
        assert !sa.search(61);
        assert 9 == sa.pop();
        assert 7 == sa.pop();
        assert sa.isEmpty();

    }
}

