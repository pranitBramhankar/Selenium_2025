package SeleniumMethods;

import java.time.Duration;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.NoSuchElementException;

public class FluentWaitPractice {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Create FluentWait instance
        Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(500))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(Exception.class);

        // Wait for the OrangeHRM link and click it
        WebElement orangeHRM_INC_Link = wait.until(driver1 ->
            driver1.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"))
        );

        if (orangeHRM_INC_Link.isDisplayed()) {
            orangeHRM_INC_Link.click();  // Opens in new tab
        }

        // Switch to new tab
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.contains("Human")) {
                System.out.println("Switched to window with title: " + title);
                break;
            }
        }

   
        
        wait.until(driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete"));
        
   
         //Wait for CS & Support link to appear
//        WebElement csSupport = wait.until(driver1 ->
//            driver1.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'CS & ')]"))
//        );
        
        WebElement csSupport = driver.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'CS & ')]"));

        // Scroll into view and click
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        if(js1.executeScript("return document.readyState").equals("complete")){
//            js1.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest', behavior: 'smooth'});", csSupport);
//        }
        
        wait.until(driver1 -> {
            JavascriptExecutor js = (JavascriptExecutor) driver1;
            String readyState = (String) js.executeScript("return document.readyState");
            if ("complete".equals(readyState)) {
                WebElement cs = driver1.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'CS & ')]"));
                js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest', behavior: 'smooth'});", cs);
                return true;  // Done waiting
            }
            return false; // Keep polling
        });
       
        Boolean a=(Boolean) wait.until(new Function<Object, Object>() {

   			@Override
   			public Boolean apply(Object t) {
   				Boolean value=csSupport.isEnabled();
   				return value;
   			}
           	
           });
        
     
        //js1.executeScript("arguments[0].click()", csSupport);
        if(a) {
        	  csSupport.click();

        }
      
        //driver.close(); // Closes current tab (CS & Support)
        // driver.quit(); // Use this if you want to close all windows
    }
}
