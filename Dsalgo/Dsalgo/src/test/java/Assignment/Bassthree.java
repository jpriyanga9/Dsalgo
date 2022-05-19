package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Bassthree {

	
	static WebDriver driver;
	
	@BeforeSuite
	public static void open() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\src\\test\\resources\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public static void main() throws InterruptedException {
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.id("friday")).click();;
		
		}


}
