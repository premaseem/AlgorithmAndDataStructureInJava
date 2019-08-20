package me.premaseem.datastructure.doublelinkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Tests {

    @Test
    public void testInsert(){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.printForward();
        assertEquals(3,dll.length());
        dll.printBackwords();
    }

    @Test
    public void testSingleItemPrints(){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(10);
        dll.printForward();
        assertEquals(1,dll.length());
        dll.printBackwords();
    }

    @Test
    public void testDelete(){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        assertFalse(dll.deleteNodeWith(55));

        assertTrue(dll.deleteNodeWith(30));
        dll.printForward();

        assertTrue(dll.insertNodeAfter(20,100));
        dll.printForward();
    }
}
