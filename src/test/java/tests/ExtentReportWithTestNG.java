package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class ExtentReportWithTestNG {

	WebDriver driver = null;
	GoogleSearchPageObjects searchobj;
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest log;

	@BeforeSuite
	public void suiteSetup() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/spark.html");
		extent.attachReporter(spark);
	}

	@org.testng.annotations.BeforeTest
	public void tBeforetest() {
		System.out.println("From @beforetest");
	}

	@org.testng.annotations.BeforeClass
	public void tBeforeclass() {
		System.out.println("@beforeclass");
	}

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test1() {
		log = extent.createTest("Test1");

		driver.get("http://google.com");

		searchobj = new GoogleSearchPageObjects(driver);
		searchobj.setTextInSearchBox("from testNG");
		searchobj.clickSearchButton();

		log.pass("From @Test");
	}

	@Test
	public void test2() {
		System.out.println("test2");
		log = extent.createTest("Test2");
		driver.get("http://bing.com");
		log.pass("From @Test");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		log.pass("From @Aftermethod");
	}

	@org.testng.annotations.AfterClass
	public void tAfterclass() {
		log.info("From @Aftereclass");
	}

	@org.testng.annotations.AfterTest
	public void tAftertest() {
		log.info("From @Aftertest");
	}

	@AfterSuite
	public void suiteTeardown() {
		log.info("@AfterSuite");
		extent.flush();
	}
}
