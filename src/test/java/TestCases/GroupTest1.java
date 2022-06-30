package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest1 extends TestBase {

	
	LoginPage login;
    @BeforeMethod(groups= {"feb","jan"})
   
    public void setup() throws IOException
    {

      initialization();
     login = new LoginPage();
       }	


       @Test(groups= {"feb"})
     public void verfiytitletest()
     {
     String title = login.verifytitle();
     Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title ); 
      }


       @Test(groups= {"jan"})
       public void verifykitelogoTest() {

       boolean value =  login.verifykitelogo();
     	Assert.assertEquals(value, true);
        }


        @Test(groups= {"feb"})
        public void verifyzerodhalogo()
        {
       boolean value1 = login.verifyzerodhalogo();
       Assert.assertEquals(value1, true);;

          }


      @Test(groups= { "feb"})
     public void loginToApptest() throws InterruptedException, IOException 
      {
      String nickname = login.loginToApp();
      Assert.assertEquals(nickname, "Pratiksha");
      }

       @AfterMethod(groups= {"feb","jan"})
      public void exit()
      {

     	driver.quit();
      }



}


