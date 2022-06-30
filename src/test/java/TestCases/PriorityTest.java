package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class PriorityTest extends TestBase{
	          
	
	
	    LoginPage login;
	    @BeforeMethod
         public void setup() throws IOException
	{
		
		initialization();
	    login = new LoginPage();
	   }	
	
	
	     @Test(priority=-10)
        public void verfiytitletest()
          {
	    String title = login.verifytitle();
      	Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title ); 
         }
    
	
	       @Test(priority=2)
	      public void verifykitelogoTest() {
    	
         boolean value =  login.verifykitelogo();
	     Assert.assertEquals(value, true);
         }
     
    
          @Test(priority=0)
           public void verifyzerodhalogo()
          {
	       boolean value1 = login.verifyzerodhalogo();
           Assert.assertEquals(value1, true);;
     
          }
	
    
          @Test(priority=33)
         public void loginToApptest() throws InterruptedException, IOException 
          {
    	String nickname = login.loginToApp();
         Assert.assertEquals(nickname, "Pratiksha");
          }
   
        
          @AfterMethod
          public void exit()
         {
	  
      	driver.quit();
        }
   

}

		
		