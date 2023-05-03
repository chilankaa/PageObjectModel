package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.UtilityClass;

public class InputFormPage {
	WebDriver driver;
	By inputform = By.xpath("//a[contains(text(),'Input Form')]");
	By showmessage=By.xpath("//button[@id='button-one']");

	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnInputform() {
		WebElement inputformelement=driver.findElement(inputform);
		inputformelement.click();
	}
	public String getInputformButtonText() {
		WebElement showmessageelement=driver.findElement(showmessage);
		UtilityClass utility=new UtilityClass(driver);
		return utility.getTextofElement(showmessageelement);
	}
}
