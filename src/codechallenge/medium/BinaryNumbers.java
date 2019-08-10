package codechallenge.medium;

/*
Task

1. Convert into Binary
2. Convert from binary to decimal
3. Count total number of 1s
4. Then find and print the base- integer denoting the maximum number of consecutive 1's in 's binary representation.

Input Format
A single integer, .


Output Format
Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

Explanation

Sample Case 1:
The binary representation of 5 is , 101 so the maximum number of consecutive 's is 1 .
The binary representation of 13 is , 1101 so the maximum number of consecutive 's is 1 .


 */


import org.junit.Assert;
import org.junit.Test;

public class BinaryNumbers {

    @Test
    public void test() {
        // Test Driven Development
        Assert.assertEquals("101", toBinary(5));
        Assert.assertEquals("1101", toBinary(13));

        Assert.assertEquals(5, toDecimal("101"));
        Assert.assertEquals(13, toDecimal("1101"));

        Assert.assertEquals(2, totalOnes(5));
        Assert.assertEquals(3, totalOnes(13));

        Assert.assertEquals(2, consecutiveOne(13));
    }

    String toBinary(int i) {
        int q = i;
        String r = "";
        while (q >= 1) {
            int ri = q % 2;
            r = ri + r;
            q = q / 2;
        }
        System.out.printf("Binary conversion of %s is %s", i, r);
        return r;

    }

    int toDecimal(String b) {
        char[] ba = b.toCharArray();
        int sum = 0;
        //"1101"
        for (int i = 0; i < ba.length; i++) {
            int d = Integer.parseInt("" + ba[i]);
            sum += d * Math.pow(2, ba.length - 1 - i);
        }
        return sum;
    }

    int totalOnes(int n) {
        String r = toBinary(n);
        return r.length() - r.replace("1", "").length();
    }

    int consecutiveOne(int n) {
        char[] ca = toBinary(n).toCharArray();
        int mc = 0;
        int ct = 0;
        for (int i = 0; i < ca.length - 1; i++) {
            if (ca[i] == '1') {
                ct++;
                mc = ct > mc ? ct : mc;
            } else {
                ct = 0;
            }

        }
        return mc;
    }

}
