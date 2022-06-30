package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ParallelTest {
	
	
	
	@Test
	
	public  void openchrome () throws InterruptedException 
     {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	      Thread.sleep(3000);
	      driver .manage().window().maximize();
		  driver.get("http://chrome.com");
		  driver.close();
     }
	
	
	
	@Test
	public void openfb()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	
	@Test
    public void openamazon() 
 
     {
	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
     WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	 driver.close();
      }
    }
