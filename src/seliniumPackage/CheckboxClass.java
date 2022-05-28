package seliniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://training.qaonlinetraining.com/testPage.php");
        
        WebElement checkboxBoat = driver.findElement(By.xpath("//input[@value='boat']"));
//      checkbox bike
      WebElement checkboxBike = driver.findElement(By.xpath("//input[@value='Bike']"));
//      checkbox car
      WebElement checkboxCar = driver.findElement(By.xpath("//input[@value='car']")); // selected by-default
      // checkbox horse
      WebElement checkboxHorse = driver.findElement(By.xpath("//input[@value='horse']"));
      // submit button
      WebElement submitButton = driver.findElement(By.xpath("//input[@value='Send']"));
//      selecting all options except car- selected by-default
      checkboxBoat.click();
      checkboxBike.click();
      checkboxHorse.click();
      System.out.println("wait 3 seconds and submit and close");
      submitButton.click();
      Thread.sleep(3000);
      driver.close();
        
	}

}
