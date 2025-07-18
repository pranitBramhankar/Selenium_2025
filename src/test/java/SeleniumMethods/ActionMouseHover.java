package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		
		WebElement desktopTab = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		WebElement macSubMenu = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(desktopTab).build().perform();
	}

}
