package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninAcc {
	WebDriver driver ;
	
	public By signIn = By.linkText("Sign in");
	public By Username = By.name("username");
	public By Password = By.name("password");
	public By logInBtn = By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
	public By Tag = By.xpath("/html/body/div[2]");
	
	
	public SigninAcc (WebDriver driver) {
		this.driver=driver;
		}
	
	public void clickSignin () {
		driver.findElement(signIn).click();
	}
	
	public void userDetails(String username, String password) throws InterruptedException {
		driver.findElement(Username).clear();
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(password);
		
		driver.findElement(logInBtn).click();
		
//		String tag= "You are logged in";
//		String act_tag= driver.findElement(Tag).getText();
		
				
	}

}
