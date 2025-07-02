package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		Thread.sleep(2000);
		
		Boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		
		System.out.println(logo);
		
		WebElement maleRadio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		System.out.println(maleRadio.isSelected());
		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		
		driver.quit();
	}

}
