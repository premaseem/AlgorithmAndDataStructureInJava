package crackingTheCodingInterview.chap1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * One Away:
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 *
 * EXAMPLE
 * pale, ple -> true ,
 * pales, pale -> true ,
 * pale bale -> true ,
 * pale bake -> false
 */
public class OneAway {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

//        assert solution1("pale", "ple" );
//        assert solution1("pales", "pale" );
//        assert solution1("pale", "bale" );
//        assert !solution1("pale", "bake" );


        String[][] tests = {
//                {"adfdsfadsf", "acdfdsfdsf", "false"},
                {"a", "b", "true"},
                {"d", "de", "true"},
                {"pale", "pse", "false"},
                {"acdsfdsfadsf", "acdsgdsfadsf", "true"},
                {"acdsfdsfadsf", "acdsfdfadsf", "true"},
                {"acdsfdsfadsf", "acdsfdsfads", "true"},
                {"acdsfdsfadsf", "cdsfdsfadsf", "true"},

                {"pale", "pkle", "true"},
                {"pkle", "pable", "false"}
        };
        for (int i = 0; i < tests.length; i++) {
            String[] test = tests[i];
            String a = test[0];
            String b = test[1];
            boolean expected = test[2].equals("true");
//            assert expected == solution1(a, b );
            System.out.println(a +" =>  "+b);
            Assert.assertEquals(expected, solution1(a,b));

        }

    }

    // Basic solution
    private boolean solution1(String s1, String s2) {
//        int ec = 0;
        int added = s2.length() - s1.length() > 0 ? s2.length() - s1.length() : 0;
        int removed = s1.length() - s1.length() > 0 ? Math.abs(s1.length() - s2.length()) : 0;
        // if insert or delete happened

        if(added +removed > 1) return false;

        // find edit cases and track number;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        ArrayList<Character> al = new ArrayList<>();


        for(Character c: c2){
            al.add(c);
        }


        for(int i=0; i < c1.length; i++){
            if(al.contains(c1[i])){
                al.remove(al.indexOf(c1[i]));
                c1[i] = '0';
            }
        }

        int mod = 0;
        for (int i = 0; i < c1.length; i++) {
            if(c1[i] != '0'){
                mod++;
            }
        }
        if (mod + added > 1) return false;

        return true;
    }

}
