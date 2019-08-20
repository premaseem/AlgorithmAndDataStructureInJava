package codebase1.datastructure.circularQueue;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

/*
Need to build a circular queue, first item will get over written when queue overflows.

Circular Queue is also a linear data structure, which follows the principle of FIFO(First In First Out),
but instead of ending the queue at the last position, it again starts from the first position after the last,
hence making the queue behave like a circular data structure.

 */
public class CircularQueueWithArrays {

    Queue q = new PriorityQueue();

    String[] ca;
    int size = 0;
    int front = 0;
    int back = -1;

    public CircularQueueWithArrays() {
        ca = new String[4];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == ca.length;
    }

    int size() {
        return size;
    }

    String peekBack() {
        return ca[back];
    }

    String peekFront() {
        return ca[front];
    }

    void enQueue(String s) {
        back++;
        // roll over the circular index
        if (back >= ca.length) {
            back = 0;
        }

        if (isFull() && back == front) {
            front++;
        }

        ca[back] = s;
        // Do not increment size if more then finite length
        if (!(size >= ca.length)) {
            size++;
        }

    }

    String deQueue() {
        if (size == 0) {
            return null;
        }
        String current = ca[front];
        front++;
        // roll over the circular index
        if (front >= ca.length) {
            front = 0;
        }

        size--;
        return current;
    }

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        CircularQueueWithArrays cq = new CircularQueueWithArrays();
        cq.enQueue("a1");
        assert "a1" == cq.peekBack();

        // new front element
        assert "a1" == cq.peekFront();


        cq.enQueue("a2");
        cq.enQueue("a3");
        cq.enQueue("a4");

        assert 4 == cq.size();
        assert "a4" == cq.peekBack();
        cq.enQueue("b1");
        assert "b1" == cq.peekBack();

        // new front element
        assert "a2" == cq.peekFront();

        assert "a2" == cq.deQueue();
        assert "a3" == cq.deQueue();
        assert "a4" == cq.deQueue();

        assert "b1" == cq.peekBack();
        assert "b1" == cq.peekFront();

        assert "b1" == cq.deQueue();
        assert null == cq.deQueue();

        cq.enQueue("c2");
        assert 1 == cq.size();
        assert "c2" == cq.peekFront();
        assert "c2" == cq.peekBack();

    }


}
