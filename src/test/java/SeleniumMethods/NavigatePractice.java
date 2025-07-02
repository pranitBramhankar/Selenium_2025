package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.nopcommerce.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().to("https://demo.nopcommerce.com/");
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().back()

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//driver.navigate().to("https://demo.nopcommerce.com/");
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		//driver.navigate().back();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
	}

}
