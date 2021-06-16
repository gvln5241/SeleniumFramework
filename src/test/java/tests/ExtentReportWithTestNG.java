package tests;

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

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void test1() {
		log = extent.createTest("Test1");

		driver.get("http://google.com");
		log.info("URL opened");

		searchobj = new GoogleSearchPageObjects(driver);

		searchobj.setTextInSearchBox("from testNG");
		
		searchobj.clickSearchButton();
		log.pass("From @Test 1");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		log.pass("closing the browser");

		driver.quit();
		log.info("Last step in tearDown");
		log.info("End of Test execution");
		
		log.pass("From @Aftermethod");
	}

	@AfterSuite
	public void suiteTeardown() {
		log.info("@After Suite");
		extent.flush();
	}

	@Test
	public void test2() {
		System.out.println("test2");
		log = extent.createTest("Test2");
		driver.get("http://bing.com");
		log.pass("From @Test 2");
	}

	@org.testng.annotations.BeforeClass
	public void tBeforeclass() {
		System.out.println("@beforeclass");
	}
	
	@org.testng.annotations.AfterClass
	public void tAfterclass() {
		log.info("From @Aftereclass");
	}
	
	@org.testng.annotations.BeforeTest
	public void tBeforetest() {
		System.out.println("From @beforetest");
	}
	
	@org.testng.annotations.AfterTest
	public void tAftertest() {
		log.info("From @Aftertest");
	}
	
}
