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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
	}
	
	@Test
	public void flask()
	{
	   driver.manage().window().maximize(); 
  
            
 
           driver.get("http://localhost:5000");

           WebElement addCustLink = driver.findElement(By.xpath("//a[contains(text(),'Add Customer')][1]"));
           addCustLink.click()  ;
           driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 


           WebElement nameField = driver.findElement(By.xpath("//input[@type='text'][@name='name'][1]"));
		nameField.sendKeys("Jack Hill");
          
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
		
           WebElement emailField = driver.findElement(By.xpath("//input[@type='email'][@name='email'][1]"));
		emailField.sendKeys("jack@gmail.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
			

           WebElement addressField = driver.findElement(By.xpath("//input[@type='text'][@name='address'][1]"));
		addressField.sendKeys("345 Hill Drive, Sanjose 30489");
  
           driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  

           WebElement submitLink = driver.findElement(By.xpath("//input[@type='submit'][@value='Submit'][1]"));
		submitLink.click();
  
           driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 

 
            //driver.close()	
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
