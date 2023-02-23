package pgModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginPage {
	
	WebDriver driver;
	
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\CapstoneP\\chromedriver.exe");

	
	
	@Test
	void  f() throws InterruptedException, IOException {
	


	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://demo.automationtesting.in/Register.html");
	
	
	//class provider -->   PageFactory
	
	//objRepository v=new objRepository();
	
	
	
	PageFactory.initElements(driver, objRepository.class);
	
	
	
	objRepository.name.sendKeys("Admin");
	
	
	objRepository.pass.sendKeys("admin123");
	
	objRepository.scrn(driver);
	
	//objRepository.submitbtn.click();
	Thread.sleep(2000);
	
	
	//driver.quit();
	
	
	//objRepository.click.click();
	
	
	
	

	
	
}
}