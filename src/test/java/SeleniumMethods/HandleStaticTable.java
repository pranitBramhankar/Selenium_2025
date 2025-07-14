package SeleniumMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement staticTableHeading = driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].scrollIntoView()", staticTableHeading);
		
		//print total rows
		
		int numberOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("Total Rows = "+numberOfRows);
		
		//print Header
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		
		for(WebElement header : headers) {
			System.out.print(header.getText()+" ");
		}
		System.out.println();
		
		//print details of books
		
//		List<WebElement> bookNames = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[1]"));
//		
		String requiredDetails = "Master In Selenium";
//		
//		//WebElement allDetails = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td"))
//		
//		for(WebElement bookName : bookNames) {
//			String name = bookName.getText();
//			
//			if(name.equalsIgnoreCase(requiredDetails)) {
//				
//			}
//		}
//		
//		List<WebElement> books = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
//		
//		for(WebElement details : books) {
//			String allDetails = details.getText();
//			
//			if(allDetails.contains(requiredDetails)) {
//				System.out.println(allDetails);
//			}
//		}
//		
		int totalColumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		
		for(int i=2; i<=numberOfRows; i++) {
			String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
			
			if(bookName.equalsIgnoreCase(requiredDetails)) {
				for(int j=1; j<=totalColumn; j++) {
					System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText());
				}
			}
		}
		
		
		
		
		
		
		
		

	}

}
