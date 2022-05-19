package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.ExcelUtils;

public class Testing {
	
	static WebDriver driver;

	ExcelUtils data = new ExcelUtils("C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\src\\test\\java\\Utilities\\Project.xlsx" ,"Login");
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeSuite
	public static void open() {
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\91948\\eclipse-workspace\\Dsalgo\\src\\test\\resources\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
		report = new ExtentReports("C:/Users/91948/eclipse-workspace/Dsalgo/ExtentReportResults.html");
		test = report.startTest("Testing");
		
	}
	
	
	@Test(priority = 0)
	public static void click_on_getStarted() {
		Getstarted objGetstarted = new Getstarted(driver);
		objGetstarted.clickOnGetStarted();
		if(driver.getTitle().equals("NumpyNinja"))
		{
		test.log(LogStatus.PASS, "Clicked GetStarted");
		}		
		else
		{
		test.log(LogStatus.FAIL, "GetStarted Test Failed");
		}
	}
	
	/*@Test
	public static void click_on_register() {
		RegisterAccount objregister = new RegisterAccount(driver);
		objregister.clickOnRegister();
		//Random randomGenerator = new Random();  
		//int randomInt = randomGenerator.nextInt(1000);
		//String username = "username"+ randomInt +"@gmail.com";
		objregister.userSignup("username@gmail.com","Password@123", "Password@123");
	}
	*/
	@Test(priority = 1)
	public static void signInPageInvalid() throws InterruptedException, IOException {
		SigninAcc objsignInAcc = new SigninAcc(driver);
		objsignInAcc.clickSignin();
		String userName = ExcelUtils.getCellDataString(2,0);
		System.out.println("User:"+userName);
		String password = ExcelUtils.getCellDataString(2,2);
		System.out.println("pwd:"+password);
		objsignInAcc.userDetails(userName,password);
		System.out.println("Test Invalid login completed");
		Thread.sleep(1000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:/Users/91948/eclipse-workspace/Dsalgo/target/Screenshots/InvalidLogin.png"));
		System.out.println("the Screenshot is taken");
		test.log(LogStatus.PASS, "Test Invalid login completed");
		
				
		
	}
	
	@Test(priority = 2)
	public static void signInPage() throws InterruptedException {
		SigninAcc objsignInAcc = new SigninAcc(driver);
		objsignInAcc.clickSignin();
		String userNames = ExcelUtils.getCellDataString(1,0);
		System.out.println("User:"+userNames);
		String passwords = ExcelUtils.getCellDataString(1,1);
		System.out.println("pwd:"+passwords);
		objsignInAcc.userDetails(userNames,passwords);
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Test login completed");
		
	}
	
	@Test(priority = 3)
	public static void Dropdown() throws InterruptedException {
		
			
		Dropdown objDropdown = new Dropdown(driver);
		objDropdown.selectarrays();
		objDropdown.selectLinkedList();
		objDropdown.selectStack();
		objDropdown.selectQueue();
		objDropdown.selectTree();
		objDropdown.selectGraph();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Test Dropdown completed");
	}
	
	@Test(priority = 4)
	public static void graphPage() throws InterruptedException {
		
		GraphPage objGraphPage = new GraphPage(driver);
		objGraphPage.selectGraph();
		objGraphPage.selectTopics();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Test GraphPage completed");
	}
	
	@Test(priority = 5)
	public static void stackPage() throws InterruptedException {
		
		StackPage objStackPage = new StackPage(driver);
		objStackPage.selectStack();
		objStackPage.selectTopics();
		test.log(LogStatus.PASS, "Test StackPage completed");
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}

}
