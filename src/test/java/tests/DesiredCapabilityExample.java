package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilityExample {

	public static void main(String[] args) {
		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("ignoreProtectedModeSettings", true); 
		
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability("ignoreProtectedModeSettings", true);	
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.merge(cap);
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver(options);
		
		driver.get("Http://google.com");
		driver.findElement(By.name("q")).sendKeys("Abdc");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();

	}

}
