package codechallenge.easy.longestWord;

import org.junit.Assert;
import org.junit.Test;

/**
 * Have the function LongestWord(sen) take the sen parameter being passed
 * and return the largest word in the string. If there are two or more words
 * that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 * <p>
 * Sample Test Cases
 * Input:"fun&!! time"
 * Output:"time"
 * <p>
 * <p>
 * Input:"I love dogs"
 * Output:"love"
 */

public class Code {

    String findLongestWord(String sen) {
        String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
        int maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[maxIndex].length()) {
                maxIndex = i;
            }
        }
        return words[maxIndex];
    }


    @Test
    public void test() {
        Code c = new Code();
        Assert.assertEquals("love", c.findLongestWord("I love dogs"));
        Assert.assertEquals("time", c.findLongestWord("fun&!! time"));

    }
}
