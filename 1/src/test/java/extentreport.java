import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentreport {
	WebDriver driver = null;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void setUpTest()
	{
		htmlReporter = new ExtentSparkReporter("flipkartreport.html");
		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void flipkartAutomationTest1()
	{
		ExtentTest test = extent.createTest("Flipkart Testing");
		
		driver.get("https://www.flipkart.com/");
		flipkarthome  ob = new flipkarthome(driver);
		ob.setUsername("7696051651");
		ob.setPassword("7696051651");
		ob.clkbutton();
		test.pass("Login Successful");
		test.info("This step shows login on flipkart");
		
	}
		@AfterTest
		public void tearDownTest()
		{
		driver.close();
		driver.quit();
		System.out.println("test completed successfully");
		}
		@AfterSuite
		public void tearDown()
		
		{
			extent.flush();
		}









	}

