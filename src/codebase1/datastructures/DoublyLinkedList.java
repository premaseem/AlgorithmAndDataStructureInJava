package codebase1.datastructures;


import org.junit.Test;

class Node<E> {

    public Node(Node p, E d, Node n) {
        prev = p;
        next = n;
        data = d;
    }

    E data;
    Node prev;
    Node next;
}


public class DoublyLinkedList<E> {

    Node first;
    Node last;
    Integer count = 0;


    void addFirst(E d) {
        Node f = first;
        Node<E> nn = new Node(null, d, f);

        if (first == null) {
            last = nn;
        } else {
            f.prev = nn;
        }
        first = nn;
        count++;
    }

    E removeFirst() {
        if (first == null) {
            return null;
        }

        if (first == last) {
            last = null;
        }

        Node<E> r = first;

        first = first.next;

        if (first != null) {
            first.prev = null;
        }


        r.next = null;
        r.prev = null;

        count--;
        return r.data;
    }

    E removeLast() {
        if (last == null) {
            return null;
        }

        if (last == first) {
            first = null;
        }

        Node<E> r = last;
        last = last.prev;
        if (last != null) {
            last.next = null;
        }

        r.next = null;
        r.next = null;

        count--;
        return r.data;
    }

    void addLast(E d) {
        Node l = last;
        Node<E> nn = new Node(l, d, null);
        if (last == null) {
            first = nn;
        } else {
            l.next = nn;
        }
        last = nn;
        count++;

    }


    Integer size() {
        return count;
    }

    void printForwards() {
        System.out.println(" \n Print forwards");
        Node n = first;
        while (n != null) {
            System.out.print(">> " + n.data);
            n = n.next;
        }
    }

    void printBackwords() {
        System.out.println(" \n Print Backwords");
        Node n = last;
        while (n != null) {
            System.out.print(">> " + n.data);
            n = n.prev;
        }
    }


    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        DoublyLinkedList<String> ll = new DoublyLinkedList();
        ll.addFirst("Zero");
        ll.addFirst("first");
        ll.addFirst("second");

        assert 3 == ll.size();

        ll.printForwards();
        ll.printBackwords();

        ll.addLast("second last");
        ll.addLast("last");


        assert 5 == ll.size();


        assert "second" == ll.removeFirst();
        assert 4 == ll.size();
        ll.printForwards();
        ll.printBackwords();

        assert "last" == ll.removeLast();
        assert 3 == ll.size();
        ll.printForwards();
        ll.printBackwords();

        ll.removeLast();
        assert 2 == ll.size();
        ll.removeLast();
        assert 1 == ll.size();
        ll.removeLast();

        ll.printForwards();
        ll.printBackwords();



    }


}
