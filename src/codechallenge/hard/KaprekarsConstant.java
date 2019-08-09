package codechallenge.hard;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/*
Description: For this challenge you will determine when a specific sequence terminates.
Challenge
Have the function KaprekarsConstant(num) take the num parameter being passed which will be a 4-digit number with at least two distinct digits. Your program should perform the following routine on the number:
Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number), and subtract the smaller number from the bigger number. Then repeat the previous step.
Performing this routine will always cause you to reach a fixed number: 6174. Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174). Your program should return the number of times this routine must be performed until 6174 is reached. For example: if num is 3524 your program should return 3 because of the following steps: (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174.

Hard challenges are worth 15 points and you are not timed for them.

Sample Test Cases
Input:2111
Output:5


Input:9831
Output:7

 */
public class KaprekarsConstant {

    @Test
    public void test(){
        Assert.assertEquals(3, getNumOfHops(9231));
        Assert.assertEquals(5, getNumOfHops(2111));
        Assert.assertEquals(7, getNumOfHops(9831));
    }

    public int getNumOfHops(int n) {

        int c = 0;
        while(n != 6174){
            n = getNewNum(n);
            System.out.println(n);
            c++;
        }

        return c;
    }

    String ensureFourDigit(int n){
        String sn = String.valueOf(n);
        int gap = 4 - sn.length();
        for (int i = 0; i < gap; i++) {
            sn += "0";
        }


            return sn;
    }

    Integer getNewNum(int n){
        char[] sn =ensureFourDigit(n).toCharArray();
        Arrays.sort(sn);
        String as = new String(sn);
        String ds = new StringBuilder(as).reverse().toString();
        Integer fc = Integer.parseInt(as);
        Integer sc = Integer.parseInt(ds);
        return fc > sc ? fc - sc : sc - fc;
    }

}
