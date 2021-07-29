package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import customizedLibraries.PageActions;
import propertyFilesReader.PropertiesReader;

public class RegistrationPage {
	WebDriver driver = null;
	PageActions action;
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);
	}
	public void openGmail() throws IOException {
		
		 driver.get(PropertiesReader.elementLocatorReader("gmail_URL"));
	}
	
	public void clickOnSignButton() throws IOException {
		try {
		 action.clickonButton(driver.findElement(By.xpath(PropertiesReader.
				elementLocatorReader("gmail_signIn_button_xpath"))));
		}
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
			
		}
	}
	
	public void clickOnCreateButton() throws IOException {
		try {
		action.clickonButton(driver.findElement(By.xpath(PropertiesReader.
				elementLocatorReader("gmail_create_button_xpath"))));
		}
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void selectMySelf() throws IOException {
		Actions act = new Actions(driver);
		WebElement myselfOption = driver.findElement(By.xpath(PropertiesReader.elementLocatorReader("gmail_dropDown_myself_xpath")));
		act.moveToElement(myselfOption).click().perform();
	}
	
	public void enterFirstName(String FirstName) throws IOException {
		try {
		action.enterDataIntoTextBox(driver.findElement(By.id(PropertiesReader.
				elementLocatorReader("registration_page_firstName_textBox_id"))), FirstName);
		}
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void enterLastName(String LastName) throws IOException {
		try {
		action.enterDataIntoTextBox(driver.findElement(By.id(PropertiesReader.
				elementLocatorReader("registration_page_lastName_textBox_id"))), LastName);
		}
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void enterUserName(String UserName) throws IOException {
		try {
		action.enterDataIntoTextBox(driver.findElement(By.name(PropertiesReader.
				elementLocatorReader("registration_page_userName_textBox_name"))),UserName);
	     }
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void enterPassword(String Password) throws IOException {
		try {
		action.enterDataIntoTextBox(driver.findElement(By.xpath(PropertiesReader.
				elementLocatorReader("registration_page_password_textBox_xpath"))), Password);
	}
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void enterConfirmPassword(String ConfirmPassword) throws IOException {
		try {		
		action.enterDataIntoTextBox(driver.findElement(By.xpath(PropertiesReader.
				elementLocatorReader("registration_page_confirmPassword_textBox_xpath"))), ConfirmPassword);
		}
	
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void clickOnShowPassword() throws IOException {
		try {
		action.clickonCheckBox(driver.findElement(By.xpath(PropertiesReader.
				elementLocatorReader("registration_page_showPassword_checkBox_xpath"))));
		}
		catch(Exception e) {
			System.out.println("**************** Exception *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void maximizeWindow() {
		try {
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("**************** Exception occured while maxinizing the window*********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void waitToPageLoad() {
		try {
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			System.out.println("**************** Exception Occured while Page loading *********************");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void waitToElementsLoad() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

}
