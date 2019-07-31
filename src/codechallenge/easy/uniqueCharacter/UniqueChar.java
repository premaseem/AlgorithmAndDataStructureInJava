package codechallenge.easy.uniqueCharacter;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

    // Find the word is made of only unique characters.

    @Test
    public void test(){
        String input1 = "aseem"; boolean output1 = false;
        String input2 = "asdfgh"; boolean output2 = true;
        Assert.assertFalse(areAllCharsUnique(input1));
        Assert.assertTrue(areAllCharsUnique(input2));
    }

    boolean areAllCharsUnique(String word){

        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            Character current = word.charAt(i);
            if(chars.contains(current)){
                return false;
            }
            chars.add(current);
        }
        return true;
    }


}
