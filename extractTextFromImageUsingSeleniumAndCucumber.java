package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import net.sourceforge.tess4j.*;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Author: Anna Qiao
public class extractTextFromImageUsingSeleniumAndCucumber {
	WebDriver driver;
	@Given("^user is on the new registration page$")
	public void user_is_on_the_new_registration_page() {
		System.setProperty("webdriver.firefox.marionette", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.get("https://login.aliexpress.com/join/buyer/expressJoin.htm?tracelog=login&return=http%3A%2F%2Fwww.aliexpress.com");
	}

	@When("^user enter invalid data on the page$")
	public void user_enter_valid_data_on_the_page(DataTable arg1) throws IOException, TesseractException, InterruptedException {
	  //initialize data table
		 List<List<String>> data = arg1.raw(); 
		 System.out.println(data.get(1).get(1));
		 //enter email address
		 driver.findElement(By.id("email-ipt")).sendKeys(data.get(1).get(1));
		 //enter First name and Last name
		 driver.findElement(By.id("first-name-ipt")).sendKeys(data.get(2).get(1));
		 driver.findElement(By.id("last-name-ipt")).sendKeys(data.get(3).get(1));
		 driver.findElement(By.id("password-ipt")).sendKeys(data.get(4).get(1));
		 driver.findElement(By.id("confirm-password-ipt")).sendKeys(data.get(5).get(1));
		 

		// get and capture the dynamic code of the img element
		 WebElement ele = driver.findElement(By.id("refresh-checkcode-btn"));
		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
	        // Get entire page screenshot  
	        BufferedImage fullImg=ImageIO.read(screenshot);  
	        // Get the location of element on the page  
	        org.openqa.selenium.Point point= ele.getLocation();  
	        System.out.println("??????"+point);
	        // Get width and height of the element  
	        int eleWidth= ele.getSize().getWidth();  
	        int eleHeight= ele.getSize().getHeight();  
	        // Crop the entire page screenshot to get only element screenshot  
	        BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);  
	        ImageIO.write(eleScreenshot, "jpg", screenshot);  
	        // Copy the element screenshot to disk  
	        File screenshotLocation= new File("C:\\gitHub\\Cucumber_SeekAutomation\\picture\\test.jpg");
	        screenshotLocation.createNewFile();
	        FileUtils.copyFile(screenshot, screenshotLocation); 
	        Thread.sleep(5000);
	        // tesseract can convert IMG TO file.
		 Tesseract instance = new Tesseract(); 
		 // set 'tessdata' direction path
		 instance.setDatapath("C:\\Program Files (x86)\\Tesseract-OCR\\tessdata");
		 instance.setLanguage("eng");
		 String result = null;
		 System.out.println("text....."+result);
			result = instance.doOCR(screenshotLocation);
			System.out.println("text....."+result);
		 driver.findElement(By.id("checkcode-ipt")).sendKeys(result);
	}

	

	@Then("^user registration should be unsuccess$")
	public void user_registration_should_be_success() {
		//locate submit button element
	    driver.findElement(By.id("submit-btn")).click();
	    String actResult=driver.findElement(By.id("checkcode-tipbox")).getText();
	    System.out.println("error code: "+actResult);
	    if ("Type the characters you see in the picture".equals(actResult))
	    {
	    	System.out.println("This method of verfication  is strong, I can extract code incorrectly"); 
	    	System.out.println("test pass"); 
	    }else {
	    	System.out.println("This method of verfication  is weak, I can extract code correctly"); 
	    	System.out.println("test fail");
	    }
	}
	@After
	public void cleanup()
	{
		driver.close();
	}
}
