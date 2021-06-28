package demo;

import org.openqa.selenium.WebDriver;

public class FluentWait {
	protected WebDriver driver;
	
	//from git
/*
	@Test
	public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		
		driver = new ChromeDriver();
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		// Maximizes the browser window
		driver.manage().window().maximize();
		// get the actual value of the title
		aTitle = driver.getTitle();
		// compare the actual title with the expected title
		
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(
						"/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
			}
		});
		// click on the selenium link
		clickseleniumlink.click();
		// close~ browser
		driver.close();
	}
	*/
}
