package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowUsingKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);//open tab in same browser
		
		driver.switchTo().newWindow(WindowType.WINDOW);//open newly browser
		
		System.out.println(driver.getWindowHandles());

	}

}
