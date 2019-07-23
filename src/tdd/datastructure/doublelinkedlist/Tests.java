package tdd.datastructure.doublelinkedlist;

import org.junit.Test;
import sun.jvm.hotspot.debugger.windbg.DLL;

import static org.junit.Assert.assertEquals;

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
}
