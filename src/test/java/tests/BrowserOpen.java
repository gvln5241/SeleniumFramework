package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOpen {

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");

//		System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", projectpath + "/drivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://selenium.dev");
		driver.findElement(By.xpath("//*[@title='search']")).sendKeys("Selenium");
		

	}

}

