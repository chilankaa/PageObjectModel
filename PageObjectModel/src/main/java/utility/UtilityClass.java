package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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

	public List<String> getTextOfElements(String xpath) {
		List<String> list = new ArrayList<String>();
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			list.add(text);
		}
		return list;
	}

	public List<String> getTextOfElements(List<WebElement> elements) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			list.add(text);
		}
		return list;
	}
}
