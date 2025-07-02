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

public class ImplicitWaitPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // ✅ Wait until the "OrangeHRM, Inc" link is visible
        WebElement orangeHRM_INC_Link = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")));

        // Click to open new tab
        if (orangeHRM_INC_Link.isDisplayed()) {
            orangeHRM_INC_Link.click();
        }

        // ✅ Switch to the new tab that contains the word "Human" in the title
        String parent = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(parent)) {
                driver.switchTo().window(handle);
                wait.until(webDriver -> js.executeScript("return document.readyState").equals("complete"));
                if (driver.getTitle().contains("Human")) {
                    System.out.println(driver.getTitle());
                    break;
                }
            }
        }

        // ✅ Wait until the element in the footer is present (fix the text if needed)
        WebElement csSupport = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='footer-main']//a[contains(text(),'CS & ')]")));

        // ✅ Scroll into view in a centered way
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", csSupport);

        // ✅ Wait until it's clickable, then click
        wait.until(ExpectedConditions.elementToBeClickable(csSupport));
        js.executeScript("arguments[0].click();", csSupport);

        driver.close();
    }
}
