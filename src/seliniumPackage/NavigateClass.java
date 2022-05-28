package seliniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println("this is " + driver.getTitle() + " website");
        System.out.println("url is: " + driver.getCurrentUrl());
        // navigating to another site
        driver.navigate().to("http://www.instagram.com/");
        System.out.println("this is " + driver.getTitle() + " website");
        System.out.println("url is: " + driver.getCurrentUrl());
        // navigating to another site
        driver.navigate().to("http://www.twitter.com/");
        System.out.println("this is " + driver.getTitle() + " website");
        System.out.println("url is : " +driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("this is " + driver.getTitle() + " website");
        System.out.println("url is: " + driver.getCurrentUrl());
        // navigating back to google .com
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("this is " + driver.getTitle() + " website");
        System.out.println("url is: " + driver.getCurrentUrl());
        driver.close();

	}

}
