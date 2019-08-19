package codechallenge.medium;


import org.junit.Test;


/*
Code Challenge :
Given: A sorted linked list and a number.
Expectation: place the given number in sorted linked list.


eg. Insert 45 and maintain sorting  of linked list
Input >> 3 >> 10 >> 20 >> 35 >> 55
Output >> 3 >> 10 >> 20 >> 35 >> 45 >> 55

 */


public class LinkedList<E> {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        LinkedList<Integer> ll = new LinkedList();
        ll.addLast(3);
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(35);
        ll.addLast(55);

        ll.printForwards();
        ll.insertInSortedOrder(65);
        ll.printForwards();
        ll.printBackwords();

        // assert if linked list is sorted.
        for(Node<Integer> n = ll.first; n.next != null; n = n.next){
            if (n.next != null && (int)n.next.data < n.data){
                assert false;
            }
        }
    }


    void insertInSortedOrder(Integer e) {
        Node<Integer> current = first;
        if (null == first) {
            Node<Integer> nn = new Node<>(null, e, null);
            first = nn;
            last = nn;
        }
        while (current != null) {
            if (current.data >= e) {
                Node<Integer> nn = new Node<>(current.prev, e, current);
                if (current.prev != null) {
                    current.prev.next = nn;
                }
                current.prev = nn;
                // head the head or first element
                if ((Integer) first.data > e) {
                    first = nn;
                }
                return;
            }
            current = current.next;

        }
        //
        Node<Integer> nn = new Node<>(last, e, null);
        last.next = nn;
        last = nn;

    }


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
            System.out.print(" >> " + n.data);
            n = n.next;
        }
    }

    void printBackwords() {
        System.out.println(" \n Print Backwards");
        Node n = last;
        while (n != null) {
            System.out.print(" >> " + n.data);
            n = n.prev;
        }
    }


}

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
