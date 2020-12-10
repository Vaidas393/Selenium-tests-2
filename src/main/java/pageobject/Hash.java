package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;
import pageobject.*;


public class Hash extends PageObject {
	
	public Utils util = new Utils();
//	variables inside decode site
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/a")
    private WebElement nextBtn;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[3]/div/form/input")
    private WebElement input;

	@FindBy(id = "confirm-password")
    private WebElement confirm;

//	variables inside hash sitezzz
	@FindBy(id = "string")
    private WebElement hashInput;

	@FindBy(xpath = "//*[@id=\"cap\"]/button")
    private WebElement generate;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/form/strong")
    private WebElement generatedHash;

    public Hash(WebDriver driver) {
        super(driver);
    }


      public void firstSecond(String password, String password2, String random) throws InterruptedException{
      driver.get("https://coding-challenge.festo.com/stage/1)");
      Thread.sleep(500);
      this.nextBtn.click();
	  this.input.click();
	  Thread.sleep(500);
	  this.input.sendKeys(password);
	  Thread.sleep(500);
	  this.confirm.click();
	  Thread.sleep(500);
	  this.nextBtn.click();
	  this.input.click();
	  Thread.sleep(500);
	  this.input.sendKeys(password2);
	  this.confirm.click();
	  this.nextBtn.click();
    }

      public void fourth() throws InterruptedException{
    	  Utils utils = new Utils();
    	  for (int i = 0; i < 1000; i++) {
    		  driver.get("https://www.md5hashgenerator.com/");
    		  this.hashInput.click();
    		  this.hashInput.sendKeys(utils.randomPass());
    		  Thread.sleep(500);
    		  this.generate.click();
    		  Thread.sleep(500);
    		  String generatedHashes = this.generatedHash.getText();
    		  driver.get("https://coding-challenge.festo.com/stage/4)");
    		  Thread.sleep(500);
    	      this.input.click();
    	      Thread.sleep(500);
    	      this.input.sendKeys(generatedHashes);
    		  Thread.sleep(500);
    		  this.confirm.click();
    		  Thread.sleep(500);
    		  this.nextBtn.click();
    		  }
      }

    public WebElement getNextBtn() {
    	return nextBtn;
    }

		public WebElement getInputField() {
			return input;
		}

		public WebElement getConfirmBtn() {
			return confirm;
		}

		public WebElement getHashInputField() {
			return hashInput;
		}

		public WebElement getGenerateBtn() {
			return generate;
		}

		public WebElement getGenerated() {
			return generatedHash;
		}

 }
