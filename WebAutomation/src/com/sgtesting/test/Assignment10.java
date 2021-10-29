package com.sgtesting.test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AutomationMorethan
{
	public static WebDriver Browser=null;	
	static void Launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\driver\\chromedriver.exe");
			Browser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Navigate()
	{
		try
		{
			Browser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void AdminLogin(String s1,String s2)
	{
		try
		{
			Browser.findElement(By.id("username")).sendKeys(s1);
			Browser.findElement(By.name("pwd")).sendKeys(s2);
			Browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(6000);
			Browser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void IndLogin(String s1,String s2)
	{
		try
		{
			Browser.findElement(By.id("username")).sendKeys(s1);
			Browser.findElement(By.name("pwd")).sendKeys(s2);
			Browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			Browser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			Browser.findElement(By.id("SubmitTTButton")).click();
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateUser(int i)
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.name("firstName")).sendKeys("Demo"+i);
			Browser.findElement(By.name("lastName")).sendKeys("User"+i);
			Browser.findElement(By.name("email")).sendKeys("Demouser"+i+"@gmail.com");
			Browser.findElement(By.name("username")).sendKeys("Demouser"+i);
			Browser.findElement(By.name("password")).sendKeys("Demouser"+i);
			Browser.findElement(By.name("passwordCopy")).sendKeys("Demouser"+i);
			Browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void DeleteUser()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(6000);
			Alert obj=Browser.switchTo().alert();
			obj.accept();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	static void logout()
	{
		try
		{
			Browser.findElement(By.id("logoutLink")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			Browser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void ModifyUserPwd()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(3000);
			Browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(6000);
			
			//User 1
			Browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.name("password")).sendKeys("user1");
			Browser.findElement(By.name("passwordCopy")).sendKeys("user1");
			Browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(6000);
			//User 2
			Browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.name("password")).sendKeys("user2");
			Browser.findElement(By.name("passwordCopy")).sendKeys("user2");
			Browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(6000);
			//User 3
			Browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.name("password")).sendKeys("user3");
			Browser.findElement(By.name("passwordCopy")).sendKeys("user3");
			Browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteUser1()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(3000);
			
			Browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(6000);
			//user1			
			Browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(6000);
			Alert obj=Browser.switchTo().alert();
			obj.accept();
			Thread.sleep(6000);
			//user2
			
			
			Browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(6000);
			Alert obj1=Browser.switchTo().alert();
			obj1.accept();
			Thread.sleep(6000);
			//user3
			
			
			Browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(6000);
			Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(6000);
			Alert obj2=Browser.switchTo().alert();
			obj2.accept();
			Thread.sleep(6000);		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	static void CloseApplication()
	{
		try
		{
			Browser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


public class Assignment10 {

	public static void main(String[] args) {
		AutomationMorethan.Launch();
		AutomationMorethan.Navigate();
		AutomationMorethan.AdminLogin("admin","manager");
		int i=1;
		while(i<=3)
		{
			AutomationMorethan.CreateUser(i);
			i++;
		}	
		AutomationMorethan.logout();
		AutomationMorethan.IndLogin("Demouser1","Demouser1");
		AutomationMorethan.logout();
		AutomationMorethan.IndLogin("Demouser2","Demouser2");
		AutomationMorethan.logout();
		AutomationMorethan.IndLogin("Demouser3","Demouser3");
		AutomationMorethan.logout();
		AutomationMorethan.AdminLogin("admin","manager");
		AutomationMorethan.ModifyUserPwd();
		AutomationMorethan.logout();
		AutomationMorethan.IndLogin("Demouser1","user1");
		AutomationMorethan.logout();
		AutomationMorethan.IndLogin("Demouser2","user2");
		AutomationMorethan.logout();
		AutomationMorethan.IndLogin("Demouser3","user3");
		AutomationMorethan.logout();
		AutomationMorethan.AdminLogin("admin","manager");
		AutomationMorethan.DeleteUser1();
		AutomationMorethan.logout();
		AutomationMorethan.CloseApplication();

	}

}
