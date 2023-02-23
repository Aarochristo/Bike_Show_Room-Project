package pageobjectmodel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class finalrun extends pageonelogin {
	
	
	WebDriver driver;

	String u = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";

	
	
	

	@Test
	void SetaProperties() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		String u = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		driver.get(u);

		String url = driver.getCurrentUrl();
		
		
		
		
		
		assertEquals(url, u);

	}

	@Test
	public void rullall() {

		
		pageonelogin bb=new pageonelogin();
		
		PageFactory.initElements(driver, bb);
		
		  bb.click(); bb.select();
		  
		  
		  driver.navigate().refresh();
		  
		  
		  p2DragandDrop fun=new p2DragandDrop();
		  
		  PageFactory.initElements(driver, fun);
		
		  fun.clicdrag();
		  fun.dragDrop();
		

	}

}
