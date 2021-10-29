//2) LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyUserDemo
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void createUser()
	{
		try
		{ 
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo12");
			oBrowser.findElement(By.name("lastName")).sendKeys("User12");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail12.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser12");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome12");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome12");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		
		{ 
			
			 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")).click();
						Thread.sleep(4000);
			
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);  
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
   static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
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

public class Assignment2 {

	public static void main(String[] args) {
		ModifyUserDemo.launchBrowser();
		ModifyUserDemo.navigate();
		ModifyUserDemo.login();
		ModifyUserDemo.minimizeFlyOutWindow();
		ModifyUserDemo.createUser();
		ModifyUserDemo.modifyUser();
		ModifyUserDemo.deleteUser();
		ModifyUserDemo.logout();
		ModifyUserDemo.closeApplication();
	}
}
