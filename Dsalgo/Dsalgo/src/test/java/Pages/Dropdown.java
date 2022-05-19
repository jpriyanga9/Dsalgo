package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {

	WebDriver driver ;
	
	public By dropDown = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]");
	public By selectArrays = By.linkText("Arrays");
	public By selectLinkedList = By.linkText("Linked List");
	public By selectStack = By.linkText("Stack");
	public By selectQueue = By.linkText("Queue");
	public By selectTree = By.linkText("Tree");
	public By selectGraph = By.linkText("Graph");
	
	public Dropdown (WebDriver driver) {
		this.driver=driver;
		}
	
	public void selectarrays () throws InterruptedException {
		
		driver.findElement(dropDown).click();	
		driver.findElement(selectArrays).click();
		Thread.sleep(2000);
				
	}
	public void selectLinkedList () throws InterruptedException {
		
		driver.findElement(dropDown).click();	
		driver.findElement(selectLinkedList).click();
		Thread.sleep(2000);
				
	}
	public void selectStack () throws InterruptedException {
		
		driver.findElement(dropDown).click();	
		driver.findElement(selectStack).click();
		Thread.sleep(2000);
				
	}
	public void selectQueue () throws InterruptedException {
		
		driver.findElement(dropDown).click();	
		driver.findElement(selectQueue).click();
		Thread.sleep(2000);
				
	}
	public void selectTree () throws InterruptedException {
		
		driver.findElement(dropDown).click();	
		driver.findElement(selectTree).click();
		Thread.sleep(2000);
				
	}
	public void selectGraph () throws InterruptedException {
		
		driver.findElement(dropDown).click();	
		driver.findElement(selectGraph).click();
		Thread.sleep(2000);
				
	}
}
