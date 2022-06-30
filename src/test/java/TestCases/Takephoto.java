package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.util;

public class Takephoto  extends TestBase{
	
	LoginPage login;
	@BeforeMethod
public void setup() throws IOException
	{
		
		initialization();
	login = new LoginPage();
	}	
	
	
	@Test
    public void verfiytitletest()
   {
	String title = login.verifytitle();
	Assert.assertEquals("1Kite - Zerodha's fast and elegant flagship trading platform",title ); 
   }
   
	
	
    
   
    @AfterMethod
   public void exit(ITestResult it) throws IOException
    {
	  if(ITestResult.FAILURE == it.getStatus()) 
	  {
		  util.screenshot(it.getName());
	  }
    	driver.quit();
   }
   
}
