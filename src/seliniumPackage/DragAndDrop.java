package seliniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        // focussing inside the iframe - Frame WebElement
        driver.switchTo().frame(0);
        // using xpath
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        
        // message for console - checking execution flow of program
        System.out.println("opening page...perform drag and drop");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        
        // dragAndDrop is the method() of class Action
        act.dragAndDrop(source, target).build().perform();
        System.out.println("drag N drop Done...");
        Thread.sleep(3000);
        driver.close();

	}

}
