package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.UtilityClass;

public class TablePage {
	WebDriver driver;
	By table = By.xpath("//a[contains(text(),'Table')]");
	By heading = By.xpath("//div[contains(text(),'Table with Pagination Example')]");

	public TablePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnTable() {
		WebElement tableelemnt = driver.findElement(table);
		tableelemnt.click();
	}

	public boolean isHeadingVisibility(String expectedheading) {
		WebElement headingelement = driver.findElement(heading);
		UtilityClass utility = new UtilityClass(driver);
		return utility.isTextPresent(headingelement, expectedheading);
	}
}
