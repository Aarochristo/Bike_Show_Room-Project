package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class p2DragandDrop   extends finalrun{
	
	
	@FindBy(xpath ="//span[@class='link_span' ][.='Drag And Drop']")
	public WebElement open;
	
	
	
	
	@FindBy(xpath ="//span[.='Close']")
	public WebElement closeadd;
	
	
	@FindBy(xpath = "//h5[.='High Tatras']")
	public WebElement from;
	
	
	@FindBy(id = "trash")
	public WebElement to;
	
	
	
	public void clicdrag()
	{
		
		
	
		open.click();
		closeadd.click();
		
		
	}
	
	
	
	
	
	public void dragDrop()
	{
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(from, to);
		
		
	}

}
