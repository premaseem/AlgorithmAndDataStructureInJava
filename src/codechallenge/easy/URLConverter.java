package codechallenge.easy;

// Challenge: See if you can replaces all the spaces in a a string with the
// ASCII symbol for space '%20'. Assume you are given the length of the final

import org.junit.Assert;
import org.junit.Test;

public class URLConverter {

    @Test
    public void test(){
        Assert.assertEquals("My%20Home%20Page", urlify("My Home Page    ", 16));

    }

    String urlify(String word, int max){

        word = word.trim();
        StringBuilder sb = new StringBuilder();
        char blank = " ".charAt(0);
        for (int i = 0; i < word.length(); i++) {
            Character cc = word.charAt(i);
            if( cc == blank){
                sb.append("%20");
            }else{
                sb.append(cc);
            }
        }
        return sb.toString();
    }

}
