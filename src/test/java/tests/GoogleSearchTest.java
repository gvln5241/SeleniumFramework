package tests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		//openChrome();
		googleSearch();
		
	}

//	public static void openChrome() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//	}
	
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("selenium");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	}
	
}
