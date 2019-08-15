package codebase3.datastructures;


// Test Driven Development by Aseem Jain

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StackWithArrayList<E> {

    List<E> sa;
    Integer count = -1;

    public StackWithArrayList() {
        sa = new ArrayList<>();

    }

    void push(E e) {
        sa.add(e);
        count++;
    }

    boolean isEmpty() {
        return count < 0;
    }

    E pop() {
        E e = sa.get(count);
        sa.remove(count);
        count--;
        return e;
    }

    boolean search(E e) {
        return sa.contains(e);
    }

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        StackWithArrayList<Integer> sa = new StackWithArrayList();
        assert sa.isEmpty();

        sa.push(7);
        assert !sa.isEmpty();
        assert sa.search(7);

        assert 7 == sa.pop();
        assert sa.isEmpty();

    }
}

