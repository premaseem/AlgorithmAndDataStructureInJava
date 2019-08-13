package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Calculate the run time based on Log(n) for an algo.
 * Expectation is to get nearest whole number.
 */
public class LogN {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        Assert.assertEquals(6, method(64));
        Assert.assertEquals(6, method(65));
        Assert.assertEquals(5, method(60));
        Assert.assertEquals(1, method(2));
        Assert.assertEquals(0, method(1));

        Assert.assertEquals(6, methodR(64,1));
        Assert.assertEquals(6, methodR(65,1));
        Assert.assertEquals(5, methodR(60,1));
        Assert.assertEquals(1, methodR(2,1));
        Assert.assertEquals(0, methodR(1,1));

    }

    int method(int n) {
        int c = 0;
        while (n > 1) {
            c++;
            n = n / 2;

        }
        return c;
    }

    int methodR(int n, Integer c){
//        if(n<=1) {
//            return 0;
//        }
//        return c + methodR(n/2,c);

        return n <= 1 ? 0 : c + methodR(n/2,1);

    }

}
