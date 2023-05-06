package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement datepickers;
	@FindBy(xpath = "//input[@class='form-control datepicker']")
	public WebElement enterdate;
	@FindBy(xpath = "//th[@class='prev']")
	WebElement previousbutton;
	@FindBy(xpath = "//th[@class='next']")
	WebElement nextbutton;
	@FindBy(xpath = "//th[@class='datepicker-switch']")
	WebElement currentmonth;

	public DatePickersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnDatePickers() {
		datepickers.click();
	}

	public void selectDate(String date) {
		enterdate.click();
		String splitdate[] = date.split("-");
		String year = splitdate[2];
		String day = splitdate[0];
		String monthindex = splitdate[1];
		String month = "";
		int monthnumber = Integer.parseInt(monthindex);
		int yearnumber = Integer.parseInt(year);

		switch (monthnumber) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
		default:
			break;
		}
		System.out.println(month);
		String month_year = month + " " + year;
		while (true) {
			String currentmonthtext = currentmonth.getText();
			if (month_year.equals(currentmonthtext)) {
				break;
			} else if (monthnumber > 5 && yearnumber >= 2023) {
				nextbutton.click();
			} else {
				previousbutton.click();
			}
		}
		WebElement dayelement = driver.findElement(By.xpath("//td[text()='" + day + "' and @class='day']"));
		dayelement.click();

	}
}
