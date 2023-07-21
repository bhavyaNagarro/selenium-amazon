package assignment.pages;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.LogStatus;

import assignment.utilities.ReadingPropertiesFile;

public class basePage {
	public static WebDriver driver;
	
	ChromeOptions option = new ChromeOptions();
	
	@BeforeSuite
	public void setup() {

		// setting path for Chrome driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

		option.addArguments("non-headless");
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		

		// Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	}

	@BeforeTest
	public void navigateToURL() {
		// navigating to application
		driver.get(ReadingPropertiesFile.getProperty("url"));
	}
	
	
	@AfterSuite
	public void tearDown() {
		// quitting the driver
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}
