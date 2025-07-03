package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement rightSlidingPoint = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		
		System.out.println(rightSlidingPoint.getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(rightSlidingPoint,-100,250 ).build().perform();
		
		
		
	}

}
