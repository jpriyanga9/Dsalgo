package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Bassfour {

	static WebDriver driver;
	
	@BeforeSuite
	public static void open() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\src\\test\\resources\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public static void main() throws InterruptedException, IOException {
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("username");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("create_account_error")).getText()); 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\dsalgoScreenshot.png"));
		System.out.println("the Screenshot is taken");
		}

}
