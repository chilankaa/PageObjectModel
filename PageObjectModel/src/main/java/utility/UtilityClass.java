package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass {
	WebDriver driver;

	public UtilityClass(WebDriver driver) {
		this.driver = driver;
	}

	public String getTextofElement(WebElement element) {
		return element.getText();
	}

	public boolean isTextPresent(WebElement element, String expectedtext) {
		String actualtext = element.getText();
		return actualtext.equals(expectedtext);
	}
}
