package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GraphPage {
	
	WebDriver driver ;
	
	public By dropDown = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]");
	public By selectGraph = By.linkText("Graph");
	public By optionone = By.linkText("Graph");
	public By optiontwo = By.linkText("Graph Representations");
	public By optiontry = By.linkText("Try here>>>");
	public By writecode = By.xpath("//div[@class='input']/textarea");
	public By Runcode = By.xpath("//*[@id=\"answer_form\"]/button");
	public By output = By.id("output");
	
	
	public GraphPage (WebDriver driver) {
		this.driver=driver;
		}
	
	public void selectGraph () throws InterruptedException {
		
		driver.findElement(dropDown).click();	
		driver.findElement(selectGraph).click();
		Thread.sleep(100);
				
	}
	
	public void selectTopics() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(optionone).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(optiontry).click();
		//		driver.findElement(writecode).sendKeys("print \"Hello graph\" ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement text = driver.findElement(By.cssSelector(".CodeMirror textarea"));
		text.sendKeys("print \"Hello graph\"");
		Thread.sleep(500);
//		WebElement textarea = driver.findElement(writecode);
//		//JavaScript Executor to enter text 
//		js.executeScript("arguments[0].value= '\"Hello graph\"'",textarea);
		driver.findElement(Runcode).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(output).getText());
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(optiontwo).click();
		js.executeScript("window.scrollBy(0,5000)", "");
		driver.findElement(optiontry).click();
		WebElement texttwo = driver.findElement(By.cssSelector(".CodeMirror textarea"));
		texttwo.sendKeys("print \"Hello graph representation\"");
		Thread.sleep(500);
		driver.findElement(Runcode).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(output).getText());
		driver.navigate().back();
		
		
	}

}
