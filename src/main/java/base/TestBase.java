package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
		
		public void initialization()
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
		}

		
}
