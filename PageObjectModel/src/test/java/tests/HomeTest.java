package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class HomeTest extends BaseClass {
	HomePage homepage ;

	@Test
	public void verify_logoVisibility() {
		homepage= new HomePage(driver);
		homepage.isObsquraLogoDisplayed();
	}
}
