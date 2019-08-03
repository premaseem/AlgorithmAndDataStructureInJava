package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tags: math fundamentals | Difficulty: Easy
 * Challenge
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num.
 * For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter num will be any number from 1 to 1000.
 *
 * Sample Test Cases
 * Input:12
 * Output:78
 *
 *
 * Input:140
 * Output:9870
 */
public class SimpleAddition {

    @Test
    public void t(){
        Assert.assertEquals(78,SimpleAddingWithLoop(12));
        Assert.assertEquals(9870,SimpleAddingWithLoop(140));

        Assert.assertEquals(78,addWithRecursion(12));
        Assert.assertEquals(9870,addWithRecursion(140));

    }

    int SimpleAddingWithLoop(int num){
        int sum =0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        return sum;
    }

    int addWithRecursion(int num){
        if (num <= 1 ){
            return 1;
        }
        return num + addWithRecursion(num -1);
    }
    
}
