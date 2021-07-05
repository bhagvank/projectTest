package org.devops.selenium.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class SeleniumTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		//driver.get("https://demoqa.com/");
	}
	
	@Test
	public void flask()
	{
	   driver.maximize_window()  
  
           driver.delete_all_cookies()  
 
           driver.get("http://localhost:5000")

           driver.find_element_by_xpath("//a[contains(text(),'Add Customer')][1]").click()  
           time.sleep(4) 


           driver.find_element_by_xpath("//input[@type='text'][@name='name'][1]").send_keys("Jack Hill")
  
           time.sleep(2) 
           driver.find_element_by_xpath("//input[@type='email'][@name='email'][1]").send_keys("jack@gmail.com")
  
           time.sleep(2) 

           driver.find_element_by_xpath("//input[@type='text'][@name='address'][1]").send_keys("345 Hill Drive, Sanjose 30489")
  
           time.sleep(2) 

           driver.find_element_by_xpath("//input[@type='submit'][@value='Submit'][1]").click()
  
           time.sleep(2) 

 
            driver.close()	
	}
	
	/*
	@Test
	public void login()
	{
		driver.get("https://www.lambdatest.com/");
		
		
		WebElement logInLink = driver.findElement(By.xpath("//a[contains(text(),'login')]"));
		logInLink.click();
		
		
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		emailField.sendKeys("username@gmail.com");
		
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordField.sendKeys("Test@123");
		
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block mt-3']"));
		loginButton.click();
		
		
		String expectedURL = "https://accounts.lambdatest.com/dashboard";
		String expectedPageTitle = "Welcome - LambdaTest";
		
		String actualURL = driver.getCurrentUrl();
		String actualPageTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
					
		
		Assert.assertEquals(actualURL, expectedURL);
		
		
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
	*/
	/*@Test
	public void ToolsQaTest()
	{
		driver.findElement(By.xpath("(//div[@class=\"card-up\"])[1]")).click();
		String expectedtext="Elements";
		String actualtext=driver.findElement(By.xpath("(//div[contains(text(),\"Elements\")])[1]")).getText();
		Assert.assertEquals(expectedtext, actualtext, "Message is not Displaying as expected");
	}
	*/
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
