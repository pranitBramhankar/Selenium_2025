package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> daysCheckBoxes = driver.findElements(By.xpath("//label[contains(text(),'Days:')]/following-sibling::div//input[@type='checkbox']"));
		
		WebElement daysLable = driver.findElement(By.xpath("//label[contains(text(),'Days:')]"));
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;	
		
		js1.executeScript("arguments[0].scrollIntoView(true);", daysLable);
		
		for(WebElement day : daysCheckBoxes) {
			
			System.out.println(day.getAttribute("value"));
			if(day.getAttribute("value").equalsIgnoreCase("sunday")) {
				day.click();
			}
			day.click();
		}
		
		for(WebElement day : daysCheckBoxes) {
			
			System.out.println(day.getAttribute("value")+" "+day.isSelected());
		}
		
	}

}
