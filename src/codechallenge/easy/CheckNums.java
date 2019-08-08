package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/*
Challenge
Have the function CheckNums(num1,num2) take both parameters being passed and
return the string true if num2 is greater than num1, otherwise return the string false.
If the parameter values are equal to each other then return the string -1.
Sample Test Cases
Input:3 & num2 = 122
Output:true


Input:67 & num2 = 67

Output:-1

 */
public class CheckNums {

    @Test
    public void test(){
        Assert.assertEquals("true", doCompare(2,5));
        Assert.assertEquals("-1", doCompare(5,5));
        Assert.assertEquals("false", doCompare(8,5));
    }

    String doCompare(int num1, int num2) {
        return (num1 == num2 ? "-1" : String.valueOf(num2 > num1));
    }

}
