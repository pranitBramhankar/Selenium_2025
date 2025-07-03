package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement selectCountryDropdown = driver.findElement(By.xpath("//select[@id='country']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].scrollIntoView(true)", selectCountryDropdown);
		
		Select s1 = new Select(selectCountryDropdown);
		
		s1.selectByVisibleText("India");
		
		Thread.sleep(1000);
		
		s1.selectByValue("australia");
		
		Thread.sleep(1000);
		
		s1.selectByContainsVisibleText("Germany");
	
	}

}
