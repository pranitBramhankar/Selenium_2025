package SeleniumMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.opencart.com/");
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		File targetFile = new File("C:\\Users\\Swagat\\workspace\\Selenium_2025\\Screenshots\\fullpage1.png");
		
		SourceFile.renameTo(targetFile);
		
		//webelement screen shot
		
		WebElement googleLogo = driver.findElement(By.cssSelector("svg[class='lnXdpd'"));
		
		File SourceFile1 = ts.getScreenshotAs(OutputType.FILE);
		
		File targetFile1 = new File("C:\\Users\\Swagat\\workspace\\Selenium_2025\\Screenshots\\webelementss.png");
		
		SourceFile1.renameTo(targetFile1);
		
		

	}

}
