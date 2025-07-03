package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'right click me')]")));
		
		Actions a1 = new Actions(driver);
		
		Action action = a1.contextClick(rightClickButton).build();
		
		action.perform();

	}

}
