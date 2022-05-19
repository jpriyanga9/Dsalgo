package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Aassfour {

static WebDriver driver;
	
	@BeforeSuite
	public static void open() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\src\\test\\resources\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public static void main() throws InterruptedException {
		
		driver.findElement(By.linkText("Sign in")).click();
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		String username = "username"+ randomInt +"@gmail.com";
		driver.findElement(By.id("email_create")).sendKeys(username);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Firstname");
		driver.findElement(By.id("customer_lastname")).sendKeys("Lastname");
		driver.findElement(By.id("passwd")).sendKeys("Password");
		driver.findElement(By.id("company")).sendKeys("Company");
		driver.findElement(By.id("address1")).sendKeys("12345 drakeshire ln");
		driver.findElement(By.id("city")).sendKeys("City");
		WebElement testDropDown = driver.findElement(By.id("id_state"));  
		Select dropdown = new Select(testDropDown); 
		dropdown.selectByVisibleText("Michigan");
		driver.findElement(By.id("postcode")).sendKeys("48888");;
		WebElement testDropDowns = driver.findElement(By.id("id_country"));  
		Select dropdowns = new Select(testDropDowns); 
		dropdowns.selectByValue("21");
		driver.findElement(By.id("phone")).sendKeys("0123456789");
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys(String.valueOf("0123456789"));
		driver.findElement(By.id("alias")).sendKeys("address");
		driver.findElement(By.id("submitAccount")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText());
		
		
		}

}
