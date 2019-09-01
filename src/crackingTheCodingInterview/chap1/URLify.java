package crackingTheCodingInterview.chap1;

import org.junit.Test;

/**
 URLify: Write an program to replace all spaces in a string with '%20'.
 You may assume that the string has sufficient space at the end to hold the additional characters,
 and that you are given the "true" length of the string.
 (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"
 */
public class URLify {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        assert "Mr%20John%20Smith".equalsIgnoreCase(solution1("Mr John Smith "));
        assert "Mr%20John%20Smith".equalsIgnoreCase(solution2("Mr John Smith "));

    }

    // Basic solution
    private String solution1(String s) {
        s = s.trim();
        String[] sa = s.split(" ");
        if(sa.length == 0) return "";
        s = sa[0];
        for (int i = 1; i < sa.length; i++) {
            s = s+"%20"+sa[i];
        }
        return s;
    }

    private String solution2(String s) {
        s = s.trim();
        String a ="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != ' '){
                a += c;
            }else {
                a += "%20";
            }
        }
        return a;
    }
}
