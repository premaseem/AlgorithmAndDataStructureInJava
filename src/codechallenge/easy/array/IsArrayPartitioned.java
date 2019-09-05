package codechallenge.easy.array;

import org.junit.Test;

/**
 * Need to check the partition patter where sum of first half of array is equal
 * to sum of second half
 * input array is [3,4,2,2,2,1]
 * output index of parition element 2
 *
 *  * input array is [3,2,2,5,1]
 *  * output should be -1
 */
public class IsArrayPartitioned {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        int[] a = {3,4,2,2,2,1};
        assert 2 == solution1(a);

        int[] b = {3,2,2,5,1};
        assert -1 == solution1(b);

        assert 2 == solution2(a);

        assert -1 == solution2(b);

    }

    // Basic solution O(n x n)
    private int solution1(int[] a) {

        int fh =0;

        for (int i = 0; i < a.length; i++) {
            fh += a[i];
            int sh =0;
            for (int j = i+1; j < a.length; j++) {
                sh += a[j];
            }
            if(fh == sh){
                return i+1;
            }
        }

        return -1;
    }

    // Optimized solution O(n)
    private int solution2(int[] a) {

        int sum =0;
        int fh =0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        // to get the partition, first half
        for (int i = 0; i < a.length; i++) {
            fh += a[i];

            if(fh == sum/2){
                return i+1;
            }
        }

        return -1;
    }


}
