package classone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class one {
WebDriver driver =null;
	
	
	@FindBy(linkText =   "Highlights")
	public  WebElement a;
	
	

	
         public	one(WebDriver driver)
         {
        	       	 
        	 this.driver=driver;
        	 PageFactory.initElements(driver,this);
        	 
         }
         
         
         public void aa()
         {
        	 
        	 
        	 a.click();
         }
}
