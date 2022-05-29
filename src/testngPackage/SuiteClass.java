package testngPackage;

import org.testng.annotations.Test;

public class SuiteClass {
	@Test(groups = "testcases")
	  public void openWebsite() {
	      System.out.println("openWebsite");
	  }
	  @Test(groups = "testcases")
	  public void enterData() {
	      System.out.println("enterData");
	  }
	  @Test(groups = "testcases")
	  public void pressLogin() {
	      System.out.println("pressLogin");
	  }
	  @Test(groups = "explore")
	  public void explorePage() {
	      System.out.println("explorePage");
	  }


}
