package testmaven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static testmaven.App.div;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */


    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    @org.junit.Test(expected = RuntimeException.class)

    public void testDivisin(){
        double res = 3.0;
        assertEquals("Result should be equals: + res", res, div(6, 2), 0);
        assertEquals("Result should be equals: + 7", 7, div(35, 5));
        div(5, 0);


    };

}
