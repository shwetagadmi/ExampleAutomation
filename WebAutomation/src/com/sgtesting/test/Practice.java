package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice {
	public static WebDriver oBrowser = null;
	public static void main(String[] args){
		launchBrowser();
		navigate();
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
			oBrowser.get("https://www.amazon.com/");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes");
           WebElement searchIcon= oBrowser.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
           searchIcon.click();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
