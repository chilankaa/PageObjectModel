package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {
	TablePage tablepage;

	@Test
	public void verify_tableHeading() {
		tablepage=  new TablePage(driver);
		tablepage.clickOnTable();
		String expected="Table with Pagination Example";
		boolean status=tablepage.isHeadingVisibility(expected);
		Assert.assertTrue(status);
		
		
	}
}
