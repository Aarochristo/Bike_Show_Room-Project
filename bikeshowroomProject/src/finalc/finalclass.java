package finalc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import classone.class2;
import classone.one;

public class finalclass {

	WebDriver driver;

	class2 cd;
	one one;

	@Test(priority = 0)
	public void launch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\CapstoneP\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.samsung.com/in/web/cart/");

		cd = new class2(driver);
		one = new one(driver);

		cd.allows();

	}

	@Test(priority = 1)
	public void al() {

		cd.all();

	}
	@Test(priority = 2)
	public void dd() {

		System.out.println("i came");
		one.aa();
		System.out.println("i camehghjghjgygyu");
		driver.quit();

	}

}
