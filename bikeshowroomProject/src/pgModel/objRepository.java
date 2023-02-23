package pgModel;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class objRepository {

	@FindBy(xpath = "//input[@type='text' and @placeholder='First Name']")
	public static WebElement name;

	@FindBy(xpath = "//input[@type='text' and @placeholder='Last Name']")
	public static WebElement pass;
	
	
	
	

	// public static WebElement submitbtn;

//	static void scrn(WebDriver driver) throws IOException {
//
//		TakesScreenshot s = (TakesScreenshot) driver;
//
//		File input = s.getScreenshotAs(OutputType.FILE);
//
//		File output = new File("D:\\suma.png");
//		FileHandler.copy(input, output);
//		
		
		

	//fullwords}
	
	@Test
	
	void   occurenv()
	{
		
	
	
	String fullwords=" im aaron im from kochadai";
	
	
      	HashMap<String, Integer>map=new HashMap<String,Integer>();
      	
      	
      	System.out.println(map);
      	
      	
      	String sp[]=fullwords.split(" ");
      	
      	for(String s:sp)
      	{
      		
      		if(map.containsKey(s))
      		{
      			
      			
      			
      			map.put(s, map.get(s)+1);
      			
      		}
      		else
      		{
      			
      			map.put(s, 1);
      		}
      		
      		
      		
      		
      		System.out.println(map);
      		
      		
      		
      		
      	}
	
	
	}
	
	
	
	
	
	

}
