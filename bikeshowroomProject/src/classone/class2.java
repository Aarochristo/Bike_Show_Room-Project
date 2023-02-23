package classone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class2 {
	
	WebDriver driver =null;
	
	
	@FindBy(xpath = "//button[.='Continue shopping']")
	private  WebElement allow;
	
	
	
	@FindBy(linkText = "Compare")
	private  WebElement all;	
			
	
	
	
	
         public	class2(WebDriver driver)
         {
        	       	 
        	 this.driver=driver;
        	 PageFactory.initElements(driver,this);
        	 
         }
         
         
         
        public  void allows()
         {
        	 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	 allow.click();
        	 
         }
        
        public  void all()
        {
       	
       	 all.click();
       	 
        }
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
