package testngPackage;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class IExecution01 {
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
	        assertEquals(true, true);
	    }
	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("IExecutionListener**************beforeSuite");
	    }
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("IExecutionListener**************afterSuite");
	    }
}
