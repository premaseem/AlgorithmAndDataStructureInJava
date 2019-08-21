package me.premaseem.datastructure.circularQueue;

import org.junit.Test;

import java.util.LinkedList;

/*
Need to build a circular queue, first item will get over written when queue overflows.

Circular Queue is also a linear data structure, which follows the principle of FIFO(First In First Out),
but instead of ending the queue at the last position, it again starts from the first position after the last,
hence making the queue behave like a circular data structure.

 */
public class CircularQueueWithLinkedList {

    LinkedList<String> q = new LinkedList<>();
    Integer maxItems = 5;
    Integer size = 0;

    boolean isFull() {
        return maxItems == size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    String peekFront() {
        return q.peekFirst();
    }

    String peekBack() {
        return q.peekLast();
    }

    void enQueue(String i) {
        if (isFull()) {
            q.removeFirst();
        } else {
            size++;
        }
        q.addLast(i);
    }

    String deQueue() {

        if (isEmpty()) {
            return null;
        }
        String i = q.peekFirst();
        q.removeFirst();
        size--;
        return i;

    }


    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        CircularQueueWithLinkedList cq = new CircularQueueWithLinkedList();
        cq.enQueue("a1");
        assert "a1" == cq.peekBack();
//
//        // new front element
        assert "a1" == cq.peekFront();


        cq.enQueue("a2");
        cq.enQueue("a3");
        cq.enQueue("a4");

        assert 4 == cq.size;
        assert "a4" == cq.peekBack();
        cq.enQueue("b1");
        assert "b1" == cq.peekBack();

       // new front element
        assert "a1" == cq.deQueue();
        assert "a2" == cq.peekFront();

        assert "a2" == cq.deQueue();
        assert "a3" == cq.deQueue();
        assert "a4" == cq.deQueue();

        assert "b1" == cq.peekBack();
        assert "b1" == cq.peekFront();

        assert "b1" == cq.deQueue();
        assert null == cq.deQueue();

        cq.enQueue("c2");
        assert 1 == cq.size;
        assert "c2" == cq.peekFront();
        assert "c2" == cq.peekBack();

    }
}
