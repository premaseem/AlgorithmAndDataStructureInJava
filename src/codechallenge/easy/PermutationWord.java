package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Find if word is a permutation word, which means they are made of similar characters
 * <p>
 * "abc" "bca" => true
 * "abc" "bce" => false
 */
public class PermutationWord {

    @Test
    public void test() {
        Assert.assertTrue(areWordsPermutation1("abc", "bca"));
        Assert.assertFalse(areWordsPermutation1("abc", "bce"));
        Assert.assertTrue(areWordsPermutation1("aab", "baa"));
        Assert.assertFalse(areWordsPermutation1("aab", "aaad"));

        Assert.assertTrue(areWordsPermutation2("abc", "bca"));
        Assert.assertFalse(areWordsPermutation2("abc", "bce"));
        Assert.assertTrue(areWordsPermutation2("aab", "baa"));
        Assert.assertFalse(areWordsPermutation2("aab", "aaad"));

        Assert.assertTrue(areWordsPermutation3("abc", "bca"));
        Assert.assertFalse(areWordsPermutation3("abc", "bce"));
        Assert.assertFalse(areWordsPermutation3("aabc", "aabb"));
        Assert.assertFalse(areWordsPermutation3("aab", "aaad"));
    }

    boolean areWordsPermutation1(String word1, String word2) {

        // if length is not same
        if (word1.length() != word2.length()) {
            return false;
        }

        char [] chars1 = word1.toCharArray();
        char [] chars2= word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {

            if(chars1[i] != chars2[i]){
                return false;
            }
        }
        return true;
    }

    boolean areWordsPermutation2(String word1, String word2) {

        // if length is not same
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] chars1 = word1.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            char c = word2.charAt(i);
            if (!isCharInArray(c, chars1)) {
                return false;
            }
        }

        return true;
    }

    private boolean isCharInArray(char c, char[] chars) {

        for (int i = 0; i < chars.length; i++) {
            // if char is found it will return true
            if (chars[i] == c) {
                return true;
            }
        }
        // if you are out of loop without which means char was not found
        return false;
    }


    boolean areWordsPermutation3(String word1, String word2) {

        // if length is not same
        if (word1.length() != word2.length()) {
            return false;
        }
        ArrayList charSet1 = new ArrayList<>();
        ArrayList charSet2 = new ArrayList<>();

        for (int i = 0; i < word1.length(); i++) {
            charSet1.add(word1.charAt(i));
            charSet2.add(word2.charAt(i));
        }

        for (int i = 0; i < word1.length(); i++) {
            if(!charSet2.contains(word1.charAt(i))){
                return false;
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            if(!charSet2.contains(word1.charAt(i))){
                return false;
            }
        }

    return true;
    }
}
