package customizedLibraries;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import customizedLibraries.CapturingScreenshots;

public class PageActions {

	WebDriverWait wait;
	WebDriver driver=null;
	public PageActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}
	public void  clickonButton(WebElement element) throws IOException {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
		catch(Exception e) {
			System.out.println("******* Exception Occured**********");
			CapturingScreenshots.captureScreenshot(driver, "ButtonNotClickable");
			e.printStackTrace();
			Assert.fail();
			}
		}
	public void  clickonCheckBox(WebElement element) throws IOException {
		try {
		wait.until(ExpectedConditions.elementToBeSelected(element));
		element.click();
	}
		catch(Exception e) {
			System.out.println("******* Exception Occured**********");
			CapturingScreenshots.captureScreenshot(driver, "ButtonNotClickable");
			e.printStackTrace();
			Assert.fail();
			}
		}
	public void enterDataIntoTextBox(WebElement element, String text) throws IOException {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		}
		catch(Exception e) {
			System.out.println("******* Exception Occured**********");
			CapturingScreenshots.captureScreenshot(driver, "ElementnotVisible");
			e.printStackTrace();
			Assert.fail();
		}
	}
		
	public void selectVisibleTextInDropdown(WebElement element, String text) throws IOException {
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
			
		}
		catch(Exception e) {
			System.out.println("******* Exception Occured**********");
			CapturingScreenshots.captureScreenshot(driver, "ElementnotSelected");
			e.printStackTrace();
			Assert.fail();
		}
		
	}
		
	
}
