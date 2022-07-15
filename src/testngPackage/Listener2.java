package testngPackage;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listener2 {
	@Test
    public void test4() {
        System.out.println("I am test 4 and I will pass");
    }
    @Test
    public void test5() {
        System.out.println("I am test 5 and I will skip");
        throw new SkipException("I am skipping");
    }
    @Test
    public void test6() {
        System.out.println("I am test 6 and I will fail");
        assertEquals(true, false);
    }

}
