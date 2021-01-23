import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

class flipkart {

	WebDriver driver = null;
	@BeforeTest
	
		public void setupTest() {
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        
	        
	        WebDriverManager.chromedriver().setup();
	        driver= new ChromeDriver(options);

	}
	@Test
	public void login()
	{
	   flipkarthome  ob = new flipkarthome(driver);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        ob.setUsername("7696051651");
        ob.setPassword("7696051651");
        ob.clkbutton();
        
	}
	@Test(priority = 2)
    public void searching() throws InterruptedException {
       Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchingproductonflipkart sr= new searchingproductonflipkart(driver);
       // sr.clickonsearch();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sr.enterproduct("samsung galaxy s21");
    Thread.sleep(3000);
        sr.searchBtn();
	}
}

		



		

		

	

