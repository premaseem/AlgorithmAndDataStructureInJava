package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Have the function LetterChanges(str) take the str parameter being passed
 * and modify it using the following algorithm. Replace every letter in the
 * string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 *
 *  Sample Test Cases
 * Input:"hello*3"
 * Output:Ifmmp*3
 *
 *
 * Input:"fun times!"
 * Output:gvO Ujnft!
 */

public class CryptString {


    @Test
    public void test(){
        Assert.assertEquals("gvO Ujnft!", LetterChanges("fun times!"));
        Assert.assertEquals("Ifmmp*3", LetterChanges("hello*3"));
        Assert.assertEquals("zfA", LetterChanges("yez"));
    }


    String LetterChanges(String input) {
        String output = "";
        char letter;
        for( int i = 0; i < input.length(); i++){
            letter = input.charAt(i);
            if (letter == 'z'){
                letter = 'a';
            }else
            if( letter >= 'a' && letter < 'z' ){
                letter++;
            }


            if( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
                letter = Character.toUpperCase(letter);
            }


            output = output + letter;
        }
        return output;
    }

}
