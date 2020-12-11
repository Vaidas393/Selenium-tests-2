package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class SimpleTest {
	public WebDriver driver;

	  @Test(invocationCount  = 1)
	  public void openMyBlog() throws InterruptedException {
//	     open hash site try string
   	 driver.get("https://www.md5hashgenerator.com/");
		 driver.findElement(By.id("string")).click();
		 driver.findElement(By.id("string")).sendKeys("Example");
		 driver.findElement(By.xpath("//*[@id=\"cap\"]/button")).click();
	     String password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/form/strong")).getText();

//	    open challenge site and try tests
		driver.get("https://coding-challenge.festo.com/stage/1");
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/a")).click();
//	    enter password and push next
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/form/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/form/input")).sendKeys("hello world");
	    Thread.sleep(1000);
	    driver.findElement(By.id("confirm-password")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/a")).click();

//	    enter password and push next
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/form/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/form/input")).sendKeys("f9c29");
	    Thread.sleep(1000);
	    driver.findElement(By.id("confirm-password")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/a")).click();

//	    enter password and push next
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/form/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/form/input")).sendKeys(password);
	    Thread.sleep(5000);
	    driver.findElement(By.id("confirm-password")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/a")).click();
	  }

	  @BeforeClass
	  public void beforeClass() {

			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	   }

	}
