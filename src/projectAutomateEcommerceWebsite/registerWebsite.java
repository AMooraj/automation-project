package projectAutomateEcommerceWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class registerWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webpage 
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationpractice.com/index.php");
        //sign in button code
        driver.findElement(By.className("login")).click();
        System.out.println("signin was click");
        //enter the email address
        WebElement email= driver.findElement(By.id("email_create"));
        email.sendKeys("ambreen.mooraj@gmail.com");
        driver.findElement(By.id("SubmitCreate")).submit();
        
        //credentials
        //trial 1
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@value = 2]")).click();
        

        //WebElement radioButton = driver.findElement(By.xpath("//*input[@id='id_gender2']"));
        //radioButton.click();
        //System.out.println("radio button click");
        
        //trial 2 
        //driver.findElement(By.xpath("//input[@value = 2]")).click();
        
        //trial 3
        //driver.findElement(By.id("id_gender2")).click();
        
        
        // credentials for firstname & Last name
        //trial 1
        WebElement firstname = driver.findElement(By.id("customer_firstname"));
        firstname.sendKeys("Amber");
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastname.sendKeys("Moor");
        System.out.println("first name and last name entered");
        //trial 2
        //driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("amber");
      //trial 3
        //driver.findElement(By.id("customer_firstname")).sendKeys("Amber");
        
      //credentials for Password
        driver.findElement(By.id("passwd")).sendKeys("12345");
        System.out.println("password collected");
        
        // credentials date of birth from dropdown elements
        Select day = new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
        day.selectByValue("2");
        
        Select month = new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
        month.selectByValue("2");
        
        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
        year.selectByValue("2000");
        
        System.out.println("day, month and year selected");
        
        //credentials for Address
        
        WebElement firstname1= driver.findElement(By.id("firstname"));
        firstname1.sendKeys("");
        
        WebElement lastname1 = driver.findElement(By.id("lastname"));
        lastname1.sendKeys("");
        
        WebElement companyname = driver.findElement(By.id("company"));
        companyname.sendKeys("ABC Service");
        
        WebElement address1 = driver.findElement(By.id("address1"));
        address1.sendKeys("address1");
        
        WebElement address2 = driver.findElement(By.id("address2"));
        address2.sendKeys("optional");
        
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("city");
        
        Select state = new Select (driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
        state.selectByVisibleText("Virginia");
        
        System.out.println("name,lastname, address, city, state all entered");
        
        WebElement zip = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        zip.sendKeys("1000");
        //question what if i want valid 5 digit password how to control that?
        
        Select country = new Select (driver.findElement(By.xpath("//*[@id=\"id_country\"]")));
        country.selectByVisibleText("United States");
        
        driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("additional info present");
        
        WebElement homephone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        homephone.sendKeys("123-456-789");
        //question I want numbers only
        
        WebElement mobilephone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        mobilephone.sendKeys("123-456-789");
        
        WebElement assignalias = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        assignalias.clear();
        assignalias.sendKeys("alias address 123");
        
        WebElement registerbtn = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        registerbtn.submit();
        System.out.println("Clicked on register button");
        // question how did it came back to first page
        
        
        
        
	}

	

}
