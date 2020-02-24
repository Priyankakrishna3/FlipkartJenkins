import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/Drivers/geckodriver.exe");
	}
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
