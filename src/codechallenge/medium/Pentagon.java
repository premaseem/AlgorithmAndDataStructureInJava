package codechallenge.medium;

import org.junit.Test;

/**
Challenge | Medium
Have the function PentagonalNumber(num) read num which will be a positive integer and determine
how many dots exist in a pentagonal shape around a center dot on the Nth iteration.
For example, in the image below you can see that on the first iteration there is only a single dot,
on the second iteration there are 6 dots, on the third there are 16 dots, and on the fourth there are 31 dots.

Your program should return the number of dots that exist in the whole pentagon on the Nth iteration.

Sample Test Cases
Input:2
Output:6

Input:5
Output:51

 */
public class Pentagon {

    @Test
    public void test() {
        assert 6 == getDots(2);
        assert 51 == getDots(5);

        assert 6 == iterDots(2);
        assert 51 == iterDots(5);
    }

    // with loop
    int getDots(int i) {
        int totaldots = 1;
        for (int j = 1; j <= i; j++) {
            totaldots += ((j - 1) * 5);
        }
        return totaldots;
    }

    // with recursion
    int iterDots(int i){
        if(i ==1){
            return 1;
        }
        int dots =  (i-1) * 5;
        return dots + iterDots(i-1);
    }
}
