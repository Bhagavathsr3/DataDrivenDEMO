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
	    options.addArguments("--headless=new");                 // New headless mode for Chrome 140+
        options.addArguments("--no-sandbox");                   // Required for Linux
        options.addArguments("--disable-dev-shm-usage");        // Avoid shared memory issues
        options.addArguments("--disable-gpu");                  // Optional
        options.addArguments("--remote-allow-origins=*");       // Selenium 4+
        options.addArguments("--user-data-dir=/tmp/chrome");    // Temp user profile
        options.addArguments("--disable-features=VizDisplayCompositor"); // Fix EC2 crashes
        options.addArguments("--disable-software-rasterizer");  // Fix EC2 crashes
        options.addArguments("--disable-extensions");           // Clean profile
        options.addArguments("--window-size=1920,1080");        // Optional, prevent tiny window issues
	        driver = new ChromeDriver(options);
	}
	
	public void getUrl() {
		driver.get("https://www.facebook.com/");
	}
}
