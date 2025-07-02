package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert with OK Button
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Alert a1 = driver.switchTo().alert();
		
		a1.accept();
		
		//alert with OK and Cancel Button
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		//alert get text
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//enter text in popup
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Pranit");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		

	}

}
