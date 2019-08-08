package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/*
 * Have the function SimpleSymbols(str) take the str parameter being passed and determine
 * if it is an acceptable sequence by either returning the string true or false.
 * The str parameter will be composed of + and = symbols with several characters between them
 * (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol.
 * So the string to the left would be false. The string will not be empty and will have at least one letter.
 *
 * Sample Test Cases
 * Input:"+d+=3=+s+"
 * Output:true
 * <p>
 * Input:"f++d+"
 * Output:false
 */
public class SimpleSymbols {

    @Test
    public void test() {

        Assert.assertTrue(simpleSymbol("+f+u+c+k+==="));
        Assert.assertFalse(simpleSymbol("++d+===+c++==a"));

    }

    public boolean simpleSymbol(String str) {
        // tokenize it
        char[] ca = str.toLowerCase().toCharArray();
        if (Character.isAlphabetic(ca[0]) || Character.isAlphabetic(ca[ca.length-1])) {
            return false;
        }

        // loop it and make sure after + there is a character else return false
        for (int i = 1; i < str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i)) && (str.charAt(i - 1) != '+' ||
                    str.charAt(i + 1) != '+')) {
                return false;
            }
        }

        return true;
    }
}
