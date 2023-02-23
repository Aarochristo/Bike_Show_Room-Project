package pgModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pointdim {

	

	public static void main(String[] args) {
		
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\chromedriver.exe");

		driver = new ChromeDriver();
		
		
		Point f=new Point(1500, 652);

		
		
		System.out.println(driver.manage().window().getSize());

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.manage().window().setPosition(f);
		WebElement v=driver.findElement(By.xpath("//h4[.='Selenium Grid']"));
		
		Dimension d=v.getSize();
		
		System.out.println(d.height);
		System.out.println(d.width);
		
		Rectangle r=v.getRect();
		
		
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		
		
		System.out.println(r.getX());
		System.out.println(r.getY());

		
		

	}

}
