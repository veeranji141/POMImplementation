package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.InitiateDriver;
import pages.PracticePage;

public class TC_001 extends InitiateDriver{
	
	@Test
	public void tc_001() {
		
	PracticePage practice = new PracticePage();
	PageFactory.initElements(driver, practice);
	practice.enterUserName();
	practice.clickonRadioButton();
	practice.enterCountryName();
	}
}
