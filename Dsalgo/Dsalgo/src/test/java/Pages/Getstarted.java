package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Getstarted {
	 WebDriver driver;
	
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/a")).click();
	public By getStarted = By.xpath("/html/body/div[1]/div/div/a") ;
	
	public Getstarted (WebDriver driver) {
		this.driver=driver;
		}
	
	public void clickOnGetStarted() {
		driver.findElement(getStarted).click();
		}
}
