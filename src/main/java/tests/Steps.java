package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.Utils;
import pageobject.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Steps {

	public WebDriver driver;
	public Hash hash;
	Utils utils = new Utils();

	@Test
	public void Should_Pass_First() throws InterruptedException {
		hash = new Hash(driver);

		hash.firstSecond("hello world", "f9c29", utils.randomPass());
	}

	@Test(invocationCount  = 1)
	public void fourth() throws InterruptedException {
		hash = new Hash(driver);

		hash.fourth();
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
//      driver.quit();
	}

}
