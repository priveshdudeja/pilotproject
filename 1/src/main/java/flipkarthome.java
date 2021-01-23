import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;





public class flipkarthome {
	WebDriver driver = null;
    By username_text = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
    By password_text= By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
    By Login_btn=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
    
    
    public  flipkarthome(WebDriver driver) {
        this.driver=driver;
        
    }
    
   
    
    public void setUsername(String text)
    {
        driver.findElement(username_text).sendKeys(text);
    }
    
    public void setPassword(String text)
    {
        driver.findElement(password_text).sendKeys(text);
    }
    
    public void clkbutton()
    {
        driver.findElement(Login_btn).sendKeys(Keys.RETURN);
    }
    
    

 

}

