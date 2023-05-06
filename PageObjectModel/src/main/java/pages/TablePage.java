package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.UtilityClass;

public class TablePage {
	WebDriver driver;
	

	@FindBy(xpath = "//a[contains(text(),'Table')]")
	WebElement tablelink;
	@FindBy(xpath = "//div[contains(text(),'Table with Pagination Example')]")
	WebElement headinglink;
	@FindBy(xpath = "//table//tbody//tr//td[3]")
	List<WebElement> officeelements;
	@FindBy(xpath = "//table//tbody//tr//td[1]")
	List<WebElement> personelements;

	public TablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnTable() {

		tablelink.click();
	}

	public boolean isHeadingVisibility(String expectedheading) {

		UtilityClass utility = new UtilityClass(driver);
		return utility.isTextPresent(headinglink, expectedheading);
	}

	public List<String> getAllNames(String xpath) {
		UtilityClass utility = new UtilityClass(driver);
		return utility.getTextOfElements(xpath);
	}

	public List<String> getAllOffices() {
		UtilityClass utility = new UtilityClass(driver);
		return utility.getTextOfElements(officeelements);
	}

	public String getOfficeOfPerson(String person) {
		List<String> names = new ArrayList<String>();
		UtilityClass utility = new UtilityClass(driver);
		names = utility.getTextOfElements(personelements);
		int index;
		for ( index = 0; index < names.size(); index++) {
			if (names.get(index).equals(person)) {
				index++;
				break;
			}
		}
		WebElement office = driver.findElement(By.xpath("//table//tbody//tr[" + index + "]//td[3]"));
		return office.getText();
	}
}
