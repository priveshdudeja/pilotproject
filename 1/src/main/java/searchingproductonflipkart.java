import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.Keys;
public class searchingproductonflipkart {
	

	 

	    
	    
	    
	    WebDriver driver = null;
	   // By clickOnSearchProduct=By.xpath("[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	    By enterproduct=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"); 
	   By searchBtn=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button");

	 
	    public searchingproductonflipkart (WebDriver driver) {
	        this.driver=driver;
	    }
	    
	    
	        
	    
	    
	    public void clickonsearch() {
	        driver.findElement(clickonsearch).click();
	        
	    }
	    
	    
	    public void enterproduct(String text) {
	        driver.findElement(enterproduct).sendKeys(text);
	        
	    }
	    
	    public void searchBtn() {
	        driver.findElement(searchBtn).click();
	        
	    }
	    
	    
	    

	 

	}
	 
