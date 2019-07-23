package tdd.datastructure.singlelinkedlist;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testInsertFirst(){
        SingleLinkedList sll = new SingleLinkedList();
        assertEquals(0,sll.length());
        sll.insertFirst(10);
        sll.insertFirst(20);
        sll.insertFirst(30);
        assertEquals(3,sll.length());
        sll.removeFirst();
        assertEquals(2,sll.length());
        sll.insertFirst(100);
        sll.printLinkedList();
    }

    @org.junit.Test
    public void testInsertLast(){
        SingleLinkedList sll = new SingleLinkedList();
        assertEquals(0,sll.length());
        sll.insertLast(10);
        sll.insertLast(20);
        sll.insertLast(30);
        assertEquals(3,sll.length());
        sll.printLinkedList();
        sll.insertLast(100);
        sll.printLinkedList();
    }
}
