package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 */
public class CapatilizeFirstLetterOfWords {

   @Test
   public void test(){
       Assert.assertEquals("Hello World Hack It", main("hello world hack it"));
   }


    public String main(String str) {
        String finalStr="";

        // split it by regex
        String[] sa = str.split("\\s+");

        // iterate over and replace each first charater by doing to Upper function
        for(int i=0; i < sa.length; i++){
            String s = sa[i];
            String fc = String.valueOf(s.charAt(0)).toUpperCase();
            finalStr +=  fc + s.substring(1) +" ";
        }
        return finalStr.trim();
    }



}
