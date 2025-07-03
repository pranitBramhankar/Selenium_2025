package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Pranit");
	
		Thread.sleep(1000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//label[@for='i6']//div[@class='AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.cssSelector("frame[src='frame_4.html']"));
		
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Bramhnkar");
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		

	}

}
