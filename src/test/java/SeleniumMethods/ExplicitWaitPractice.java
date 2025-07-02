package SeleniumMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement orangeHRM_INC_Link = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")));

		Boolean orangeHRMLink = orangeHRM_INC_Link.isDisplayed();

		// this will open new browser tab
		if (orangeHRMLink) {
			orangeHRM_INC_Link.click();
		}

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			driver.switchTo().window(handle);

			String title = driver.getTitle();

			if (title.contains("Human")) {
				System.out.println(title);
				break;
			}
		}

		Thread.sleep(5000);
		// switch to 2nd window

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		WebElement csSupport = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='footer-main']//a[contains(text(),'CS & ')]")));

		js1.executeScript("arguments[0].scrollIntoView(true);", csSupport);

		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(csSupport));
		csSupport.click();

		driver.close();

	}

}
