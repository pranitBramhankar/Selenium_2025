
package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
