package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetURL {
	
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  System.out.println(driver.getTitle());
	  
	  System.out.println(driver.getPageSource());
	  
	  System.out.println(driver.getWindowHandle());
	  
	  System.out.println(driver.getWindowHandles());
	  
	  
  }
  
}
