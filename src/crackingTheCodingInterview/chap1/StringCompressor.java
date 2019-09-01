package crackingTheCodingInterview.chap1;

import org.junit.Test;

/**
 * String Compression:
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompressor {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        assert "a2b1c5a3".equalsIgnoreCase(solution1("aabcccccaaa"));
        assert "a2b1c5a1".equalsIgnoreCase(solution1("aabccccca"));
        assert "asemjain".equalsIgnoreCase(solution1("asemjain"));

    }

    // Basic solution
    private String solution1(String s) {
        if(s.length() == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char p = s.charAt(0);
        int c = 1;

        for (int i = 1; i < s.length(); i++) {
            if(p == s.charAt(i)){
                c++;
            }else{
                sb.append(p).append(c);
                p = s.charAt(i);
                c=1;
            }

        }
        sb.append(p).append(c);

        System.out.println(sb);
        return s.length() <= sb.length() ? s : sb.toString();

    }

}
