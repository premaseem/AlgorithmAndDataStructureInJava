package codechallenge.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. Can you determine if a given string, , is a palindrome?

To solve this challenge, we must first take each character in , enqueue it in a queue, and also push that same character onto a stack. Once that's done, we must dequeue the first character from the queue and pop the top character off the stack, then compare the two characters to see if they are the same; as long as the characters match, we continue dequeueing, popping, and comparing each character until our containers are empty (a non-match means  isn't a palindrome).

Write the following declarations and implementations:

Two instance variables: one for your stack, and one for your queue.
A void pushCharacter(char ch) method that pushes a character onto a stack.
A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
A char popCharacter() method that pops and returns the character at the top of the  instance variable.
A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.
 */
public class Palindrome {

    // Test Driven Development by Aseem Jain
    @Test
    public void test() {

        Assert.assertEquals(true, method("racecar"));
        Assert.assertEquals(false, method("catecar"));

    }

    boolean method(String s){
        Stack<String> st = new Stack();
        Queue<String> q = new ArrayDeque<>() ;

        for(Character c: s.toCharArray()){
            st.add(""+c);
            q.add(""+c);
        }

        for (int i = 0; i < s.length(); i++) {
            String s1 = st.pop();
            String s2 = q.remove();
            if (!s1.equalsIgnoreCase(s2)){
                return false;
            }

        }
    return true;
    }

}
