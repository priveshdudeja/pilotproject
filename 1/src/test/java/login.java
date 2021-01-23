import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class login {

	WebDriver driver = null;
	@BeforeTest
	public void settingChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Privesh\\1\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test(priority = 1)
	public void loginIntoFlipkart()
	{

		driver.get("https://www.flipkart.com");
		WebElement userid = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));

		userid.sendKeys("7696051651");



		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.sendKeys("7696051651");
		password.submit();
try {
	Thread.sleep(3000);
} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

		//@Test(dataProvider = "loginIntoFlipkart", priority =2)
		//public void searchingProductOnFlipkart()
		//{

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("samsung galaxy s21");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//}



		//WebElement mobile= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span"));
		//mobile.click();

		// }
		// @Test(priority = 3)
		//public void logOut()
		// {
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		actions.moveToElement(menuOption).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[10]/a/div")); 

actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(millis);

	}

	@AfterTest
	public void closingBrowser()
	{
		driver.close();
		driver.quit();
	}

}
