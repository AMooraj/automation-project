package seliniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")) ;
        
        // Action class - action object -- passing driver information as parameter
        Actions action = new Actions(driver);
        System.out.println("Mouse is over the - HELLO, SIGN IN - option");
        
        // moveToElement is the method() of class Action
        action.moveToElement(element).build().perform();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
        System.out.println("Clicked");
	}

}
