package crackingTheCodingInterview.chap1;

import org.junit.Test;

/**
 * ### String Rotation:
 * Assume you have a method isSubstringwhich checks if one word is a substring of another.
 * Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring
 * (e.g.,"waterbottle" is a rotation of "erbottlewat").
 */
public class StringRotation {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        assert solution1("waterbottle", "erbottlewat");
        assert solution1("apple", "pleap");
        assert !solution1("camera", "macera");

    }

    // Basic solution
    private boolean solution1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String dobuleString = s1 + s1;
        // make sure s2 is part of s1
        return dobuleString.contains(s2);
    }

}
