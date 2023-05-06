package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass {
	DatePickersPage datepickerspage;

	@Test
	public void verify_datePicker() {
		datepickerspage = new DatePickersPage(driver);
		datepickerspage.clickOnDatePickers();
		String date = "25-02-2023";
		datepickerspage.selectDate(date);
	}

	@Test
	public void another() {
		datepickerspage = new DatePickersPage(driver);
		datepickerspage.clickOnDatePickers();
		String date = "25-02-2023";
		datepickerspage.enterdate.sendKeys(date);

	}
}
