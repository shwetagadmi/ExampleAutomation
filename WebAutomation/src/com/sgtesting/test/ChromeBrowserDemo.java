package com.sgtesting.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ChromeBrowserTest
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

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		ChromeBrowserTest.launchBrowser();
		ChromeBrowserTest.navigate();
		ChromeBrowserTest.closeApplication();
			}

}
