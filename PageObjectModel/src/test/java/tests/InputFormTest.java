package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
	InputFormPage inputformpage;

	@Test
	public void showmessageButtonText() {
		inputformpage = new InputFormPage(driver);
		inputformpage.clickOnInputform();
		String expectedbuttontext="Show Message";
		String actualbuttontext=inputformpage.getInputformButtonText();
		
	}
}
