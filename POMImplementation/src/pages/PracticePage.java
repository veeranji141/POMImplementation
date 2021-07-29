package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePage {
	@FindBy(xpath="//input[@id='name']") WebElement nameTextBox;
	@FindBy(xpath="//input[@id='autocomplete']") WebElement countryNameTextBox;
	@FindBy(xpath="//input[@value= 'radio1']") WebElement radioButton;

	public void enterUserName() {
		nameTextBox.sendKeys("Veeranjaneyulu");
	}
	
	public void enterCountryName() {
		countryNameTextBox.sendKeys("INDIA");
	}
	public void clickonRadioButton() {
		radioButton.click();
	}
}
