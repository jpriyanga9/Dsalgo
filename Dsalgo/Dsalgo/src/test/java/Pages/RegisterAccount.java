package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {
WebDriver driver;
	
	
	public By click = By.linkText("Register") ;
	public By userName = By.name("username");
	public By password = By.name("password1");
	public By confirmPwd = By.name("password2");
	public By clickRegister = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
	
	public RegisterAccount (WebDriver driver) {
		this.driver=driver;
		}
	
	public void clickOnRegister() {
		driver.findElement(click).click();
		}
	
	public void userSignup(String email, String passwords, String confirmPwds) {
		driver.findElement(userName).sendKeys(email);
		driver.findElement(password).sendKeys(passwords);
		driver.findElement(confirmPwd).sendKeys(confirmPwds);
		driver.findElement(clickRegister).click();
	}

}
