package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.InitiateDriver;
import customizedLibraries.CapturingScreenshots;
import pages.RegistrationPage;

public class Registration_Page_TC__002 extends InitiateDriver {

	@Test
	public void TC__001() throws IOException {
		RegistrationPage registration = new RegistrationPage(driver);
		registration.openGmail();
		registration.maximizeWindow();
		registration.waitToPageLoad();
		registration.waitToElementsLoad();
		registration.clickOnSignButton();
		registration.clickOnCreateButton();
		registration.selectMySelf();
		registration.enterFirstName("Veeranjaneyulu");
		registration.enterLastName("Thota");
		registration.enterUserName("veeranjaneyulu341");
		registration.enterPassword("Medtronic_1234");
		registration.enterConfirmPassword("Medtronic_1234");
		registration.clickOnShowPassword();
		CapturingScreenshots.captureScreenshot(driver, "RegistrationPage");
		
	}
}
