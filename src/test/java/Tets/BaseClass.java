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
options.addArguments("--headless=new");          // Headless mode for EC2
options.addArguments("--no-sandbox");            // Required in CI/CD
options.addArguments("--disable-dev-shm-usage"); // Avoids /dev/shm issues
options.addArguments("--disable-gpu");           // Disable GPU for headless
options.addArguments("--remote-debugging-port=9222"); // Fix DevToolsActivePort
options.addArguments("--window-size=1920,1080"); // Ensure screen size
	}
	
	public void getUrl() {
		driver.get("https://www.facebook.com/");
	}
}
