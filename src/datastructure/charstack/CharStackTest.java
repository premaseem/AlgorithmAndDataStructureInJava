package datastructure.charstack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharStackTest {

    CharStack charStack;

    @Before
    public void setUp(){
        charStack = new CharStack();
    }

    @Test
    public void testReverseString1(){
        String input = "hello";
        String output = charStack.getReverseStringOutOfbox(input);
        String expected = "olleh";
        assertEquals(expected, output);
    }

    @Test
    public void testReverseString2(){
        String input = "hello";
        String output = charStack.reverseByLoop(input);
        String expected = "olleh";
        assertEquals(expected, output);
    }




}
