package seliniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://training.qaonlinetraining.com/testPage.php");
        // now we will save the Web element radio in one object and perform click action
        //radio option female
        WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@value='female']"));
//        radio option male
        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@value='male']"));
//        radio option Other
        WebElement radioButtonOther = driver.findElement(By.xpath("//input[@value='Other']"));
        // submit button
        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Send']"));
        //selecting Female option - or select from the 3 web elements
        radioButtonFemale.click();
        System.out.println("wait 2 seconds and submit");
        Thread.sleep(8000);
        submitButton.click();

	}

}
