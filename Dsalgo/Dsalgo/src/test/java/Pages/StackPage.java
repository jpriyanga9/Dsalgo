package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StackPage {
	WebDriver driver ;
	
	public By dropDown = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]");
	public By selectStack = By.linkText("Stack");
	public By optionone = By.linkText("Operations in Stack");
	public By optiontwo = By.linkText("Implementation");
	public By optionthree = By.linkText("Applications");
	public By optiontry = By.linkText("Try here>>>");
	public By writecode = By.xpath("//div[@class='input']/textarea");
	public By Runcode = By.xpath("//*[@id=\"answer_form\"]/button");
	public By output = By.id("output");
	
//	public By selectStack = By.xpath("/html/body/div[2]/div[4]/div/div/a");
	
	public StackPage (WebDriver driver) {
		this.driver=driver;
		}
	

	public void selectStack () throws InterruptedException {
	
		driver.findElement(dropDown).click();	
		driver.findElement(selectStack).click();
		Thread.sleep(1000);
			
	}

	public void selectTopics() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(optionone).click();
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		js.executeScript("window.scrollBy(0,5000)", "");
		driver.findElement(optiontry).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement text = driver.findElement(By.cssSelector(".CodeMirror textarea"));
		text.sendKeys("print \"Hello stack Operations in Stack\"");
		Thread.sleep(500);
		driver.findElement(Runcode).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(output).getText());
		driver.navigate().back();
		Thread.sleep(1000);
	
		driver.findElement(optiontwo).click();
		js.executeScript("window.scrollBy(0,5000)", "");
		driver.findElement(optiontry).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement texttwo = driver.findElement(By.cssSelector(".CodeMirror textarea"));
		texttwo.sendKeys("print \"Hello stack Implementation\"");
		Thread.sleep(500);
		driver.findElement(Runcode).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(output).getText());		
		driver.navigate().back();
		
		driver.findElement(optionthree).click();
		js.executeScript("window.scrollBy(0,5000)", "");
		driver.findElement(optiontry).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement textthree = driver.findElement(By.cssSelector(".CodeMirror textarea"));
		textthree.sendKeys("print \"Hello stack Applications\"");
		Thread.sleep(500);
		driver.findElement(Runcode).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(output).getText());
		driver.navigate().back();
		Thread.sleep(1000);
	
	
}


}
