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
	   // driver = new ChromeDriver();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");                  // Run headless
	        options.addArguments("--no-sandbox");               // Required for Linux
	        options.addArguments("--disable-dev-shm-usage");    // Avoid shared memory issues
	        options.addArguments("--remote-allow-origins=*");   // For Selenium 4+
	        options.addArguments("--disable-gpu");              // Optional
	        options.addArguments("--user-data-dir=/tmp/chrome"); // Unique temp user data dir

	        driver = new ChromeDriver(options);
	}
	
	public void getUrl() {
		driver.get("https://www.facebook.com/");
	}
}
