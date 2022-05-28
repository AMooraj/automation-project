package seliniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://training.qaonlinetraining.com/testPage.php");
        
     // example 1 - accept(You accepted the alert.)
        driver.findElement(By.id("alert")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();
        
        // example 2 - dismiss(You pressed Cancel!)
        driver.findElement(By.id("confirm")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(3000);
        alert1.dismiss();
        
        // example 3 - accept and Type(Hello Mr. Bond! How are you today?)
        driver.findElement(By.id("prompt")).click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        Thread.sleep(3000);
        alert2.sendKeys("Mr. Bond");
        alert2.accept();

		
		
	}

}
