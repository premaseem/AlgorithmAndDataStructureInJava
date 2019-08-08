package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/*
Challenge
Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to
(ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon.
Sample Test Cases
Input:126
Output:2:6

Input:45
Output:0:45
 */
public class TimeConverter {

    @Test
    public void t(){
        Assert.assertEquals("2:6",convert(126));
        Assert.assertEquals("0:45",convert(45));
        Assert.assertEquals("2:30",convert(150));
    }

     String convert(int a) {
        int m = a%60;
        int h = a/60;
        return h+":"+m;
    }

}

