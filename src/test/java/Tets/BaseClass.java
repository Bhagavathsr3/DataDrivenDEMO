package Tets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class BaseClass {
	WebDriver driver;
	public void base() {
		WebDriverManager.chromedriver().setup();

	  
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu"); // Optional
            options.addArguments("--window-size=1920,1080");
            driver = new ChromeDriver(options);
	}
	
	public void getUrl() {
		driver.get("https://www.facebook.com/");
	}
}
