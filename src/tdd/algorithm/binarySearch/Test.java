package tdd.algorithm.binarySearch;

import static org.junit.Assert.assertEquals;

public class Test {

    SearchApp binarySearcher = new SearchApp();
    @org.junit.Test
    public void testBinarySearch(){
        int[] arr1 = {1,3,6,10,12,15,19,22,28,50,60,99,102};
        assertEquals(3,binarySearcher.binarySearch(arr1, 11));
        assertEquals(0,binarySearcher.binarySearch(arr1, 1));

        assertEquals(-1,binarySearcher.binarySearch(arr1, 103));
        assertEquals(7,binarySearcher.binarySearch(arr1, 22));
        assertEquals(9,binarySearcher.binarySearch(arr1, 50));
    }

    @org.junit.Test
    public void testBinarySearchRecursive(){
        int[] arr1 = {10,20,30,40,50,60,70,80,90,100};
        assertEquals(2,binarySearcher.binarySearchRecursive(arr1, 0,9,30));
        assertEquals(9,binarySearcher.binarySearchRecursive(arr1, 0,9,100));
        assertEquals(4,binarySearcher.binarySearchRecursive(arr1, 0,9,50));
        assertEquals(-1,binarySearcher.binarySearchRecursive(arr1, 0,9,32));
    }

}
