package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By logo = By.xpath("//div[@class='top-logo']//img[@alt='logo']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
//	WebElement logo = driver.findElement(By.xpath("//div[@class='top-logo']//img[@alt='logo']"));
//	WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
//	WebElement inputform = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
//	WebElement datepickers = driver.findElement(By.xpath("//a[contains(text(),'Date Pickers')]"));
//	WebElement table = driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
//	WebElement progressbars = driver.findElement(By.xpath("//a[contains(text(),'Progress Bars')]"));
//	WebElement alertsmodals = driver.findElement(By.xpath("//a[contains(text(),'Alerts and Modals)]"));
//	WebElement listbox = driver.findElement(By.xpath("//a[contains(text(),'List Box')]"));
//	WebElement others = driver.findElement(By.xpath("//a[contains(text(),'Others')]"));

	public boolean isObsquraLogoDisplayed() {
		WebElement logoelement = driver.findElement(logo);
		return logoelement.isDisplayed();
	}
}
