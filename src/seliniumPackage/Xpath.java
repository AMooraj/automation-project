package seliniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.itlearn360.com/");
		driver.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/input")).sendKeys("java");
		//how to create xpath
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");

	}

}
