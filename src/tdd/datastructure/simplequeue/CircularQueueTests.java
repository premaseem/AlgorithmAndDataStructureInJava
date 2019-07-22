package tdd.datastructure.simplequeue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircularQueueTests {

    CustomCircularQueue ccq;

    // you can insert in never ending loop
    @Test
    public void testInsert(){
        ccq = new CustomCircularQueue(4);
        assertEquals(0, ccq.peakRear().longValue());
        ccq.insert(10);
        ccq.insert(20);
        ccq.insert(30);
        ccq.insert(40);
        assertEquals(40, ccq.peakRear().longValue());
        ccq.insert(45);
        assertEquals(45, ccq.peakRear().longValue());
        ccq.insert(10);
        ccq.insert(20);
        ccq.insert(30);
        ccq.insert(560);
        assertEquals(560, ccq.peakRear().longValue());
    }

    @Test
    public void testRemoval(){
        ccq = new CustomCircularQueue(4);
        ccq.insert(10);
        ccq.insert(20);
        ccq.remove();
        assertEquals(20,ccq.peakFront());
        assertEquals(1,ccq.queueLenght());
        ccq.insert(30);
        ccq.insert(40);
        assertEquals(20,ccq.peakFront());

    }

}
