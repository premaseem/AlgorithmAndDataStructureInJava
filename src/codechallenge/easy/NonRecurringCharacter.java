package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/*
//String = abchhyiayjj , find 1st non-recurring character in string
 */
public class NonRecurringCharacter {

    @Test
    public void test(){
        // Brute Force version 1 tests
        Assert.assertEquals( 'b' , method("abchhyiayjj"));
        Assert.assertEquals( 's' , method("aseema"));
        Assert.assertEquals( 'n' , method("sonysoty"));
        Assert.assertEquals( 'd' , method("zzd"));
        Assert.assertEquals( '0' , method("aaee"));

        // Optimized version 2 tests
        Assert.assertEquals( 'b' , method2("abchhyiayjj"));
        Assert.assertEquals( 's' , method2("aseema"));
        Assert.assertEquals( 'n' , method2("sonysoty"));
        Assert.assertEquals( 'd' , method2("zzd"));
        Assert.assertEquals( '0' , method2("aaee"));

        // Optimized version 2 tests
        Assert.assertEquals( 'b' , method3("abchhyiayjj"));
        Assert.assertEquals( 's' , method3("aseema"));
        Assert.assertEquals( 'n' , method3("sonysoty"));
        Assert.assertEquals( 'd' , method3("zzd"));
        Assert.assertEquals( '0' , method3("aaee"));
    }


    // Brute Force version 1.0
    public static char method(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ca = chars[i];
            if (charNonRepeates(ca, chars)){
                return ca;
            }
        }
        return '0';
    }

    private static boolean charNonRepeates(char c, char[] arr){
        int charCount = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == c){
                charCount++;
            }
        }
        return charCount  == 1;
    }


    // Optimized version 2.0
     public char method2(String s){

        Map<Character,Integer> cm = new TreeMap<>();

        char[] chars = s.toCharArray();
        for(char c: chars){
            if(null == cm.get(c)){
                cm.put(c,1);
            }else{
                Integer count = cm.get(c);
                cm.put(c,++count);
            }
        }

        for(char c: chars){
            if (cm.get(c) == 1){
                return c;
            }
        }
      return '0';
    }

    // Optimized version 3.0
    public char method3(String s){
        for (Character c: s.toCharArray()){
            int first = s.indexOf(c);
            int second = s.indexOf(c, first + 1);
            if(second == -1){
                System.out.println(c);
                return c;
            }
        }
        return '0';
    }
}
