package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*

calculate x to the power n
using iterative and recursive approach.

 */
public class PowerOf {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        // iterative
        assert 4 == Math.pow(2,2);
        assert 64 == Math.pow(2, 6);
        assert 1000 == Math.pow(10, 3);

        // iterative
        Assert.assertEquals(4, method(2, 2));
        Assert.assertEquals(64, method(2, 6));
        Assert.assertEquals(1000, method(10, 3));

        // recursive
        Assert.assertEquals(64, methodR(2, 6));
        Assert.assertEquals(64, method(2, 6));
        Assert.assertEquals(1000, methodR(10, 3));
    }

    int method(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }
        return ans;
    }


    int methodR(int x, int n){
//        if (n == 0) {
//            return 1;
//        }
//        return x * methodR(x, n-1);

        return n == 0 ? 1 : x * methodR(x,n-1);
    }

}
