package com.sgtesting.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ModifyProjectTest
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
	static void createCustomer()
	{
		try
				{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("SampleCustomer1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
				{
			        oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[1]")).click();
					oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
					
					Thread.sleep(2000);
					oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("P1");
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
					Thread.sleep(2000);
				}catch(Exception e)
		{
					e.printStackTrace();
				}
	    }
	static void ModifyProject()
	{
		try
		{ 
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("P3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		ModifyProjectTest.launchBrowser();
		ModifyProjectTest.navigate();
		ModifyProjectTest.login();
		ModifyProjectTest.createCustomer();
		ModifyProjectTest.createProject();
		ModifyProjectTest.ModifyProject();

	}

}
