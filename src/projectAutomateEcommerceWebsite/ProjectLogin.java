package projectAutomateEcommerceWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationpractice.com/index.php");
        
        driver.findElement(By.className("login")).click();
        WebElement email=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("passwd"));
        email.sendKeys("ambreen.mooraj@gmail.com");
        password.sendKeys("abcd");
        driver.findElement(By.id("SubmitLogin"));
        
	}

}
