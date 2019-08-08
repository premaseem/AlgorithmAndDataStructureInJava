package codechallenge.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
 * For example: if the input string is "Hello World and Coders" then your
 * program should return the string sredoC dna dlroW olleH.
 */

public class ReverseStringAppTest {


    @Test
    public void testReverseString1(){
        String input = "hello";
        String output = getReverseStringOutOfbox(input);
        String expected = "olleh";
        assertEquals(expected, output);
    }

    @Test
    public void testReverseString2(){
        String input = "hello";
        String output = reverseByLoop(input);
        String expected = "olleh";
        assertEquals(expected, output);
    }

    @Test
    public void testReverseString3(){
        String input = "hello";
        String output = reverseByStack(input);
        String expected = "olleh";
        assertEquals(expected, output);

        String input1 = "my name is dick";
        String output1 = reverseByStack(input1);
        String expected1 = "kcid si eman ym";
        assertEquals(expected1, output1);

    }

    // reverse using stack
    public String reverseByStack(String input) {

        CharStack cs = new CharStack(50);
        for(int i=0; i<input.length();i++){
            cs.push(input.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while(!cs.isEmpty()){
            sb.append(cs.pop());
        }
        return sb.toString();
    }

    // reverse using for loop
    public String reverseByLoop(String input) {
        char[] chars = input.toCharArray();
        StringBuilder initial = new StringBuilder();


        for (int i = 0; i < chars.length; i++) {
            initial.append(chars[i]);
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }

        System.out.printf("initial String is %s and after reversing %s", initial, reversed);
        return reversed.toString();
    }

    // inbuild method to reverse string
    public String getReverseStringOutOfbox(String input) {
        String output = new StringBuilder(input).reverse().toString();
        return output;
    }

}

class CharStack {

    int maxSize;
    int top = -1;
    char[] charStack;

    public CharStack(int maxSize){
        this.maxSize = maxSize;
        charStack = new char[maxSize];
    }

    public void push(char c){
        top++;
        charStack[top] = c;
    }

    public char pop(){
        int old_top = top;
        top--;
        return charStack[old_top];
    }

    public boolean isEmpty(){
        return top < 0;
    }

}