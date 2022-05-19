package Assignment;

import java.util.Random;

//import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class asstwoA {
	static WebDriver driver;
	
	@BeforeSuite
	public static void open() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\src\\test\\resources\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public static void main() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")).click();
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		String username = "username"+ randomInt +"@gmail.com";
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password1")).sendKeys("Password@2");
		driver.findElement(By.name("password2")).sendKeys("Password@2");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText());
		
		}

}
