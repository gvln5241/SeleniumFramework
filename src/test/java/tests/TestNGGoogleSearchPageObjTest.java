package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class TestNGGoogleSearchPageObjTest {

	public static String browserName=null;
	private static WebDriver driver = null;
	private static WebDriverWait wait20 = null;
	PropertiesFile prop;

	@BeforeTest
	public void testSetUp() {
		prop = new PropertiesFile();
		prop.getProperties();
		
		if (browserName.toLowerCase().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");

		wait20 = new WebDriverWait(driver, 20);
	}

	@Test
	public static void GoogleSearch() {

		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

		searchPageObj.setTextInSearchBox("POM test cases");
		searchPageObj.clickSearchButton();
		searchPageObj.setTextInSearchBox("test1");
	}

	@AfterTest
	public void testTearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
}
