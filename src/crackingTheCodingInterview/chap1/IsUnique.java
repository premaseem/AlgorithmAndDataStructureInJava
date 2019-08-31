package crackingTheCodingInterview.chap1;

import org.junit.Test;

import java.util.HashSet;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

public class IsUnique {
    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        assert sol1("Sony");
        assert !sol1("Benny");

        assert sol2("Sony");
        assert !sol2("Aseem");

        assert sol3("Sony");
        assert !sol3("Aseem");

        assert sol4("Sony");
        assert !sol4("Aseem");

    }


    private boolean sol1(String s) {
        // find index and return if repeated
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean sol2(String s) {
        // find index and return if repeated
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i + 1).indexOf(s.charAt(i)) != -1) {
                return false;
            }
        }
        return true;
    }

    private boolean sol3(String s) {
        // find index and return if repeated
        HashSet<Character> cs = new HashSet<>(s.length());
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (cs.contains(c)) {
                return false;
            } else {
                cs.add(c);
            }
        }

        return true;
    }

    private boolean sol4(String s) {
        boolean[] used = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (used[c]) {
                return false;
            } else {
                used[c] = true;
            }
        }

        return true;
    }

}
