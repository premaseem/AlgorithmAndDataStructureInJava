package codechallenge.easy;

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

public class LongestWord {

    // using regex
    String findLongestWord1(String sen) {
        String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
        int maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[maxIndex].length()) {
                maxIndex = i;
            }
        }
        return words[maxIndex];
    }

    // using custom tokenization
    String findLongestWord2(String sen) {
        String[] words = new String[15];

        int k=0;
        for (int i = 0; i < sen.length(); i++) {
            int ascii = (int) sen.charAt(i);
            if ((ascii<65 || ascii>90) && (ascii<97 || ascii>122)){
                k++;
            }
            if(words[i]==null){
                words[i]="";
            }
            words[k] = words[k]+sen.charAt(i);
        }
        int maxIndex = 0;
        for (int i = 1; i < words.length; i++) {

            if (words[i]!= null && words[i].length() > words[maxIndex].length()) {
                maxIndex = i;
            }
        }
        return words[maxIndex].trim();
    }


    @Test
    public void test() {
        LongestWord c = new LongestWord();

        Assert.assertEquals("love", c.findLongestWord1("I love dogs"));
        Assert.assertEquals("time", c.findLongestWord1("fun&!! time"));

        Assert.assertEquals("love", c.findLongestWord2("I love dogs"));
        Assert.assertEquals("time", c.findLongestWord2("fun&!! time"));

    }
}
