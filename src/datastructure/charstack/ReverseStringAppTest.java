package datastructure.charstack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringAppTest {

    ReverseStringApp rsa = new ReverseStringApp();


    @Test
    public void testReverseString1(){
        String input = "hello";
        String output = rsa.getReverseStringOutOfbox(input);
        String expected = "olleh";
        assertEquals(expected, output);
    }

    @Test
    public void testReverseString2(){
        String input = "hello";
        String output = rsa.reverseByLoop(input);
        String expected = "olleh";
        assertEquals(expected, output);
    }

    @Test
    public void testReverseString3(){
        String input = "hello";
        String output = rsa.reverseByStack(input);
        String expected = "olleh";
        assertEquals(expected, output);

        String input1 = "my name is dick";
        String output1 = rsa.reverseByStack(input1);
        String expected1 = "kcid si eman ym";
        assertEquals(expected1, output1);

    }


}
