package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {
        Integer[] a = {2, 7, 11, 15};
        int[] e = {0,1};
        int[] ac = method(a,9);
        assert ac[0] == e[0];
        assert ac[1] == e[1];


        ac = method2(a,9);
        assert ac[0] == e[0];
        assert ac[1] == e[1];

        a = new Integer[] {3,3};
        e = new int []{0,1};
        ac = method(a,6);
        assert ac[0] == e[0];
        assert ac[1] == e[1];


    }

    int[] method(Integer[] arr, int t){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == t && i != j) {
                    int[] aa = {i,j};
                    return aa;
                }
            }
        }

        return null;
    }

    int[] method2(Integer[] arr, int t){

        List<Integer> l = Arrays.asList(arr);

        for (int i = 0; i < arr.length; i++) {
            int e = t - arr[i];
            int index = l.indexOf(e);
            if(-1 != index && i != index){
                return new int[] {i,index};
            }

        }

        return null;
    }

}
