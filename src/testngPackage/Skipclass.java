package testngPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skipclass {
	
	@Test
    public void foo() {
        System.out.println("this will be printed");
    }
    @Test(enabled = false)
    public void bar() {
        System.out.println("This will be skipped");
    }
    
    @Test
    public void test2() {
        System.out.println("I am test 2 and I will skip");
        throw new SkipException("I am skipping");
    }
//@Test(timeOut = 1000)
    //public void waitFor2Seconds() throws InterruptedException{
       //System.out.println("waiting for 2 seconds,will be printed but, fail this test eventually");
       //Thread.sleep(2000);
    //}
    //@Test(timeOut = 1000)
   // public void simplePrint(){
        //   System.out.println("Printing is successful");
        }



