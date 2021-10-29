package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static WebDriver oBrowser = null;
	public static void main(String[] args){
		launchBrowser();
		navigate();
		login();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}

	static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\driver\\chromedriver.exe" );
		oBrowser = new ChromeDriver();
		oBrowser.manage().window().maximize();
	}

	static void navigate() {

		try 
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}


	static void login() {

		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

	static void createCustomer()
	{
		try
				{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("SampleCuste");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}