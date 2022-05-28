package seliniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://training.qaonlinetraining.com/testPage.php");
        
        Select countrySelect = new Select(driver.findElement(By.name("country")));
        // using countrySelect to select the visible text from the drop-down menu
        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
        //or
        countrySelect.selectByVisibleText("France");
        
        //Select Option for skill menu
        Select skillSelect = new Select(driver.findElement(By.name("skill")));
        //using skillSelect to select menu options -- Programming
        skillSelect.selectByVisibleText("Programming");
        System.out.println("selectByVisibleText(\"Programming");
        //OR
        //using skillSelect to select menu options -- Database
        skillSelect.selectByVisibleText("Database");
        System.out.println("selectByVisibleText(\"Database");
        
        //Click on Send Button
        driver.findElement(By.name("submit")).click();
        System.out.println("Form Fill-up Succesfull");

		
	}

}
