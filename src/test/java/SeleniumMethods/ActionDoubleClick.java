package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement copyTextButton = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(copyTextButton).build().perform();
		
		
		

	}

}
