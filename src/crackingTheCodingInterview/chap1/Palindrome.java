package crackingTheCodingInterview.chap1;

import org.junit.Test;

/**
 * Given a string, write a function to check if it is a permutation of a palin­ drome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco eta", etc.)
 */

public class Palindrome {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        assert solution1("Rats live on no evil star");
        assert !solution1("Ha*K");

//        assert solution2("Rats live on no evil star");
        assert !solution2("Ha*K");

    }

    // Basic solution
    private boolean solution1(String s) {
        s = s.trim().toLowerCase();
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    private boolean solution2(String s) {
        s = s.trim().toLowerCase();
        String s1 ="";
        String s2 ="";
        for (int i = 0; i < s.length()/2; i++) {
            s1 += s.charAt(i);
            s2 += s.charAt(s.length()-1-i);
        }
        return s1.equalsIgnoreCase(s2);
    }
}
