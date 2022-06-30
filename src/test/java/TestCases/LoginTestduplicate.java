package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginTestduplicate extends TestBase {
	

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
   
	
	@Test
	public void verifykitelogoTest() {
    	
    boolean value =  login.verifykitelogo();
	Assert.assertEquals(value, true);
    }
     
    
    @Test 
     public void verifyzerodhalogo()
     {
	boolean value1 = login.verifyzerodhalogo();
     Assert.assertEquals(value1, true);;
     
     }
	
    
    @Test
  public void loginToApptest() throws InterruptedException, IOException {
    	String nickname = login.loginToApp();
   Assert.assertEquals(nickname, "1Pratiksha");
    }
   
    @AfterMethod
   public void exit()
    {
	  
    	driver.quit();
   }
   

}



