package crackingTheCodingInterview.chap1;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Code Check Permutation:
Given two strings, write a method to decide if one is a permutation of the
other.
 */
public class CheckPermutation {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        assert solution1("hello", "olhel");
        assert !solution1("james", "bean");

        assert solution2("hello", "olhel");
        assert !solution2("james", "bean");

        assert solution3("hello", "olhel");
        assert !solution3("james", "bean");

    }

    // Basic solution
    private boolean solution1(String s1, String s2) {

        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();

        if(ca1.length != ca2.length){
            return false;
        }

        Arrays.sort(ca1);
        Arrays.sort(ca2);

        for (int i = 0; i < ca1.length; i++) {
            if(ca1[i] != ca2[i]){
                return false;
            }
        }

        return true;
    }


    private boolean solution2(String s1, String s2) {

        int[] l = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            l[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            l[s2.charAt(i)]--;
            if((l[s2.charAt(i)]) < 0 ){
                return false;
            }
        }

        return true;
    }

    private boolean solution3(String s1, String s2) {

        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            Integer c = m1.get(ch);
            if(c!=null){
                m1.put(ch, c++);
            }else{
                m1.put(ch, 1);
            }

        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            Integer c = m2.get(ch);
            if(c!=null){
                m2.put(ch, c++);
            }else{
                m2.put(ch, 1);
            }
        }

        Set<Character> mks1 = m1.keySet();
        Set<Character> mks2 = m2.keySet();

        if(mks1.size() != mks2.size()){
            return false;
        }

        for(Character c: mks1){
            if (m1.get(c) != m2.get(c)){
                return false;
            }
        }

        return true;
    }
}
