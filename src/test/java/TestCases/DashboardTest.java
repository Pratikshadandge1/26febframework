package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardTest extends TestBase{
	
	DashboardPage dash;
	LoginPage login ;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		dash =new DashboardPage();	
	    login = new LoginPage();
	    login.loginToApp();
	}
       
       @Test(enabled=true,invocationCount=5)
    		   
	
      public  void  verifyusernametest() throws InterruptedException, IOException  
       {
	     String value = dash.verifyusername();
        Assert.assertEquals(value, "Pratiksha Bharat Dandge");
       
       }


   @Test(enabled=true,invocationCount=3)
      public void verifyemail() throws InterruptedException {
	  String value = dash.verifyemail();
	   Assert.assertEquals(value,"pratikshabdandge@gmail.com");
   }
    
   @Test
      public void pageGTTordertest() throws InterruptedException, EncryptedDocumentException, IOException
     {
	   dash.pageGTTorder();
          }
 
   @AfterMethod
	  
	  public void exist() 
  {
	  
	  driver.close();
	  }
  

}
