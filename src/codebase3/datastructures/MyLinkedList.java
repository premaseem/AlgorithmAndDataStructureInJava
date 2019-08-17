package codebase3.datastructures;


import org.junit.Test;

class Node<E>{
    public Node(E e){
        this.data = e;
    }
    Node<String> next =null;
    E data;

}


public class MyLinkedList<E> {

    Node first;

    void addFirst(E e){
        Node<String> nn = new Node(e);
            nn.next = first;
            first = nn;
    }

     boolean isEmpty() {
        return first ==null;
    }

    E removeFirst(){
        Node n = first;

        if(first != null){
            first= first.next;
        }

        return  (E)n.data;
    }

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        MyLinkedList<String> ll = new MyLinkedList();
        ll.addFirst("first");
        ll.addFirst("second");
        assert ! ll.isEmpty();

        assert "second" == ll.removeFirst();
        assert "first" == ll.removeFirst();
        assert isEmpty();

    }




}
