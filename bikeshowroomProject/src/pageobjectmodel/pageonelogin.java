package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class pageonelogin {

	

	@FindBy(xpath = "//div//child::select")

	public static WebElement dropd;

	
	
	
	public void click()
	{
		
		dropd.click();
		
	}
	
	
	public void select()
	{
		Select sel=new Select(dropd);
		sel.selectByIndex(2);
		
		

		
		
	}

}
