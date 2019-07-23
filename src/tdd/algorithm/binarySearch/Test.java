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
}
