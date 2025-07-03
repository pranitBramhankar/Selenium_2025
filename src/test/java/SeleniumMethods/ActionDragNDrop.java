package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragNDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capialMadrid = driver.findElement(By.xpath("//div[@id='box7' and text()='Madrid']"));
		WebElement countrySpain = driver.findElement(By.xpath("//div[text()='Spain']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(capialMadrid, countrySpain).build().perform();

	}

}
