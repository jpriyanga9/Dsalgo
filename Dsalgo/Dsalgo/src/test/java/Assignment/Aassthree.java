package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Aassthree {
	
	static WebDriver driver;
	
	@BeforeSuite
	public static void open() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\src\\test\\resources\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public static void main() throws InterruptedException {
		//Actions action = new Actions(driver);
		driver.findElement(By.linkText("https://courses.letskodeit.com/practice")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("benzradio")).click();
		driver.findElement(By.id("bmwcheck")).click();
		driver.findElement(By.id("hondacheck")).click();
		Thread.sleep(5000);
		driver.close();
		
		}


}
