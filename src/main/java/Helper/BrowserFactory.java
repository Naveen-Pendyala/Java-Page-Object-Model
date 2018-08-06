package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory

{
	public static WebDriver driver;

	// @Parameters("browserName")
	// A custom method to choose the browser on which the test need to be executed
	public static void startBrowser(String browserName) {

		// choose Firefox browser
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		// choose Chrome browser
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		// choose IE browser
		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./IEDriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		// choose chrome Headless browser
		if (browserName.equalsIgnoreCase("headless")) {
			System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1200x600");
			driver = new ChromeDriver(options);
		}

		// maximize browser
		driver.manage().window().maximize();

		// launch the url
		driver.get("http://35.202.73.193/Home");
	}
}
