package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class FirefoxBrowserTest1
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\driver\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
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
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*static void minimizeFlyOutWindow()
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
	}*/
}



public class LoginLogoutFirefoxBrowser {

	public static void main(String[] args) {
		FirefoxBrowserTest1.launchBrowser();
		FirefoxBrowserTest1.navigate();
		FirefoxBrowserTest1.closeApplication();
		FirefoxBrowserTest1.login();
		//FirefoxBrowserTest1.minimizeFlyOutWindow();
		//FirefoxBrowserTest1.logout();
		//FirefoxBrowserTest1.closeApplication();

	}

}
