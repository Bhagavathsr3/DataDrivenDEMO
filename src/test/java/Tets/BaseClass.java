package Tets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class BaseClass {
	WebDriver driver;
	public void base() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}
	
	public void getUrl() {
		driver.get("https://www.facebook.com/");
	}
}
