package codebase1.algorithm.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    RecursiveAlgo rec = new RecursiveAlgo();

    @Test
    public void testDownCounter(){
        rec.downCounter(10);
    }

    @Test
    public void testFactorial(){
       assertEquals(120,rec.factorialWithRecursion(5));
       assertEquals(120,rec.factorialWithLoop(5));
    }

    @Test
    public void testFibonacci(){
        assertEquals(5,rec.fibonacciWithLoop(5));
        assertEquals(8,rec.fibonacciWithLoop(6));
        assertEquals(13,rec.fibonacciWithLoop(7));
        assertEquals(21,rec.fibonacciWithLoop(8));
    }

    @Test
    public void testFibonacci1(){
        assertEquals(5,rec.fibonacciRecursion(5));

    }

}
