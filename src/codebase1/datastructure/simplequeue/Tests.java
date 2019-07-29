package codebase1.datastructure.simplequeue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    CustomQueue  cq;

    @Before
    public void init() throws Exception {
        cq = new CustomQueue(8);
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
    }
    @Test(expected = Exception.class)
    public void testInsert() throws Exception {
        CustomQueue  cq = new CustomQueue(5);
        cq.insert(3);
        cq.insert(3);
        cq.insert(3);
        cq.insert(3);
        cq.insert(3);
        cq.insert(3);
        assertEquals(5, cq.maxSize);

    }

    @Test
    public void testPrint() throws Exception{
        cq.printQueue();
        assertEquals(4,cq.queueLenght());
        cq.insert(45);
        cq.insert(55);
        assertEquals(6,cq.queueLenght());
    }

    @Test
    public void testRemove() throws Exception{
        assertEquals(4,cq.queueLenght());
        cq.remove();
        assertEquals(3,cq.queueLenght());
        cq.remove();
        assertEquals(2,cq.queueLenght());
        cq.printQueue();
        cq.remove();
        cq.remove();
        cq.remove();
    }

    @Test
    public void testPeak() throws Exception {
        assertEquals(10,cq.peakFront());
        cq.remove();
        assertEquals(20,cq.peakFront());

        assertEquals(40,cq.peakRear().longValue());
        cq.insert(50);
        assertEquals(50,cq.peakRear().longValue());
    }

}
