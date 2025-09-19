package Tets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
    public static WebDriver driver;

<<<<<<< HEAD
	  
	       ChromeOptions options = new ChromeOptions();
options.addArguments("--headless=new");          // Headless mode for EC2
options.addArguments("--no-sandbox");            // Required in CI/CD
options.addArguments("--disable-dev-shm-usage"); // Avoids /dev/shm issues
options.addArguments("--disable-gpu");           // Disable GPU for headless
options.addArguments("--remote-debugging-port=9222"); // Fix DevToolsActivePort
options.addArguments("--window-size=1920,1080"); // Ensure screen size
		 driver = new ChromeDriver(options);
	}
	
	public void getUrl() {
		driver.get("https://www.facebook.com/");
	}
}
=======
    @Test
    public void base() {
        ChromeOptions options = new ChromeOptions();

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("linux") || os.contains("unix")) {
            // Options for headless Linux (EC2, Jenkins)
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
        } else if (os.contains("win")) {
            // Options for Windows local runs
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
        }

        System.out.println("OS Detected: " + os);
        System.out.println("Running Chrome with options: " + options.toString());

        // ✅ Initialize the driver here
        driver = new ChromeDriver(options);
    }

    @Test
    public void getUrl() {
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
>>>>>>> ddefc74 (ooo)
