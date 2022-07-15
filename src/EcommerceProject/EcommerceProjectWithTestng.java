package EcommerceProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class EcommerceProjectWithTestng {
	
	WebDriver driver;
  @Test
  public void websiteRegistration() {
	  //login btn
	  WebElement loginBtn = driver.findElement((By.className("login")));
	  loginBtn.click();
	  
	  
        System.out.println("signin was click");
        
      //email btn and submit  
        WebElement email= driver.findElement(By.id("email_create"));
        email.sendKeys("areenraza@hotmail.com");
        driver.findElement(By.id("SubmitCreate")).submit();
        
        //radio btn
        WebElement radioButton = driver.findElement(By.xpath("//input[@value = 2]"));
        radioButton.click();
        System.out.println("radio button click");
        
        //first & Last name
        WebElement firstname = driver.findElement(By.id("customer_firstname"));
        firstname.sendKeys("Test first name");
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastname.sendKeys("Test last name");
        System.out.println("first name and last name entered");
        
        //credentials for Password
        driver.findElement(By.id("passwd")).sendKeys("12345");
        System.out.println("password collected");
        
        //DOB dropdown element
        Select day = new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
        day.selectByValue("1");
        Select month = new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
        month.selectByValue("4");
        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
        year.selectByValue("1989");
        
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
        // question how did it came back to first page and how did the credentials went on already registered
        
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://automationpractice.com/index.php");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
