package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		String fileName1 = "C:\\Users\\Swagat\\Downloads\\download.jpeg";
		String fileName2 = "C:\\Users\\Swagat\\Downloads\\download.jpeg";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(fileName1+"\n"+fileName2);

	}

}
