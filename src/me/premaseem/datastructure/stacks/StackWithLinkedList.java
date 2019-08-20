package me.premaseem.datastructure.stacks;


// Test Driven Development by Aseem Jain

import org.junit.Test;


public class StackWithLinkedList<E> {

java.util.LinkedList<E> ll = new java.util.LinkedList<>();

    boolean isEmpty(){
        return ll.isEmpty();
    }

    void push(E e){
        ll.push(e);
    }

    boolean search(E e){
        return   -1 != ll.indexOf(e);
    }

    E pop(){
        return ll.pop();
    }

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        StackWithLinkedList<Integer> sa = new StackWithLinkedList();
        assert sa.isEmpty();

        sa.push(7);
        sa.push(9);
        assert !sa.isEmpty();
        assert sa.search(7);

        assert 9 == sa.pop();
        assert 7 == sa.pop();
        assert sa.isEmpty();

    }
}

