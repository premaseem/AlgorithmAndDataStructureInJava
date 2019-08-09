package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Challenge
Have the function AlphabetSoup(str) take the str string parameter being passed and
return the string with the letters in alphabetical order (ie. hello becomes ehllo).
Assume numbers and punctuation symbols will not be included in the string.

Sample Test Cases
Input:"coderbyte"
Output:bcdeeorty

Input:"hooplah"
Output:ahhloop

 */
public class AlphabetSoup {

    @Test
    public void t(){
        // BF version
        Assert.assertEquals("ahhloop", converter("hooplah"));
        Assert.assertEquals("bcdeeorty", converter("coderbyte"));

        // Optimized version
        Assert.assertEquals("ahhloop", converter2("hooplah"));
        Assert.assertEquals("bcdeeorty", converter2("coderbyte"));
    }

    // BF version
    String converter(String s) {
        char[] ca = s.toCharArray();
        // convert char array to List of integer
        List<Character> ia = new ArrayList<>();
        for (Character c: ca) {
            ia.add(c);
        }

        // sort integers
        Collections.sort(ia);


        // reform the string
        String fs="";
        for (int i = 0; i <ia.size() ; i++) {
            int c = ia.get(i);
            fs+= (char) c;
        }
        return fs;
    }

    // Optimized version
    String converter2(String s) {
        char[] ca = s.toCharArray();
        List<Character> lst = new ArrayList<>();
        for(char c: ca){
            lst.add(c);
        }

        Arrays.sort(ca);
        return new String(ca);
    }
}
