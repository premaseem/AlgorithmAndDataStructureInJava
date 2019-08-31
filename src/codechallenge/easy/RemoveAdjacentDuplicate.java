package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/*
Given a string s, recursively remove adjacent duplicate characters from the string s.
The output string should not have any adjacent duplicates.

 */
public class RemoveAdjacentDuplicate {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        assert "acac" == sol("acaaabbbacdddd",0);

    }

    private String sol(String s, int n) {

        // base case
        if(n == s.length()-1){
            return "";
        }

        // expected char after comparision
        String c = s.charAt(n) == s.charAt(n+1) ? "" : s.charAt(n) + "";

        System.out.print(c);
        // recursion
        return c +  sol(s, n+1);
    }

//    private String rec(char[] sa, int i){
//        if(i == 1){
//
//        }
//    }


}
