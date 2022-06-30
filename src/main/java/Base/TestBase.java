package Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	 public static WebDriver driver;
   public String readpropertyfile( String value) throws IOException  
	   {
	Properties prop =new Properties();
     FileInputStream  file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\26FebFrame\\src\\main\\java\\config\\config.properties");
	prop.load(file);
  return prop.getProperty(value);
	 
   }
	
	public void initialization() throws IOException {
		String browserName = readpropertyfile("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
        ChromeOptions  o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		System.setProperty("Webdriver.chrome.driver","chromedriver");
	    driver =new ChromeDriver(o);
		}
	   
		else if (browserName.equalsIgnoreCase("edge"))
	    {  System.setProperty("webdriver.edge.driver","msedgedriver.exe");
	      driver=new EdgeDriver();
	    }
	    else if (browserName.equalsIgnoreCase("firefox"))
		    
	    {
	    System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	    driver=new FirefoxDriver();
	    }
	    
	    
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.get("https://kite.zerodha.com/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(readpropertyfile("url"));
		
	}
	
	public String readexcelfile(int rowNum ,int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\framework\\Testdata\\Book1.xlsx");
		Sheet excelsheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excelsheet.getRow( rowNum).getCell(cellNum).getStringCellValue();
	return value;
	}
}
