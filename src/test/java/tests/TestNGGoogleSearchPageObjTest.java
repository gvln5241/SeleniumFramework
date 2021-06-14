package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class TestNGGoogleSearchPageObjTest {

	private static WebDriver driver = null;

	@BeforeTest
	public void testSetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}

	@Test
	public static void GoogleSearch() {

		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

		searchPageObj.setTextInSearchBox("POM test cases");
		searchPageObj.clickSearchButton();
	}

	@AfterTest
	public void testTearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
}
