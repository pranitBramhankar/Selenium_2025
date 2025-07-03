package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSEClickSendKeys {
	
	WebDriver driver = new ChromeDriver();
	
	
//  @Test
//  public void clicButton() {
//	  
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	  
//	  driver.get("https://demo.nopcommerce.com/");
//	  
//	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
//	  
//	  WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
//	  
//	  js1.executeScript("arguments[0].click()", register);
//	  
//  }
  
  @Test
  public void sendKeyMethod() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement searchTextBox = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
	  
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	  
	  //js1.executeScript("arguments[0].setAttribute('Value','Yogesh')", searchTextBox);
	  
	  Thread.sleep(1000);
	  
	  //js1.executeScript("window.scrollBy(0,1500)","");
	  
	  //js1.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
	  
	  WebElement paginationHeading = driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
	  
	  js1.executeScript("arguments[0].scrollIntoView()",paginationHeading);
	  
	  Thread.sleep(1000);
	  
	  js1.executeScript("document.body.style.zoom='50%'", "");
	  
	  Thread.sleep(2000);
	  
	  js1.executeScript("document.body.style.zoom='75%'", "");
	 
  }
}
