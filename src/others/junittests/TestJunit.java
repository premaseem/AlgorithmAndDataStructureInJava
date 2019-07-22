package others.junittests;

import junit.framework.TestCase;
import org.junit.Test;

public class TestJunit extends TestCase {
    protected int value1, value2;

    // assign values in setup

    protected void setUp(){
        value1= 2;
        value2 = 4;
    }

    protected void tearDown(){
        value1= 0;
        value2 = 0;
    }

    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

    @Test
    public void testAdd1() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}