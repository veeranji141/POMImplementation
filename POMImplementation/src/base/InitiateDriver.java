package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import propertyFilesReader.PropertiesReader;

public class InitiateDriver {

	public WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch() throws IOException {
		if(PropertiesReader.elementLocatorReader("browser_name").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
			}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
