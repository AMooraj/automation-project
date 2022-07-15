package testngPackage;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listener1 {

	 @Test
	    public void test1() {
	        System.out.println("I am test 1 and I will pass");
	    }
	    @Test
	    public void test2() {
	        System.out.println("I am test 2 and I will skip");
	        throw new SkipException("I am skipping");
	    }
	    @Test
	    public void test3() {
	        System.out.println("I am test 3 and I will fail");
	        assertEquals(true, false);
	    }
}
