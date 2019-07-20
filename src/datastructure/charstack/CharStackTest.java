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
    public void testReverseString(){
        String input = "hello";
        String output = charStack.getReverseStringOutOfbox(input);
        String expected = "olleh";
        assertEquals(expected, output);
    }


}
