package tests;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {
	TablePage tablepage;

	@Test
	public void verify_tableHeading() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTable();
		String expected = "Table with Pagination Example";
		boolean status = tablepage.isHeadingVisibility(expected);
		Assert.assertTrue(status);
	}

	@Test
	public void verifyNames() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTable();
		List<String> names = tablepage.getAllNames("//table//tbody//tr//td[1]");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

	@Test
	public void verifyOffice() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTable();
		List<String> offices = tablepage.getAllOffices();
		for (int i = 0; i < offices.size(); i++) {
			System.out.println(offices.get(i));
		}
	}

	@Test
	public void verify_officeOfPerson() {
		tablepage = new TablePage(driver);
		tablepage.clickOnTable();
		String office = tablepage.getOfficeOfPerson("Brielle Williamson");
		System.out.println(office);

	}
}
