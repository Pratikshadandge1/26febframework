package Utility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class util extends TestBase {
	
	
	
	
	

	public  static void screenshot(String name) throws IOException {
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File ("C:\\Users\\hp\\eclipse-workspace\\26FebFrame\\Screenshots/"+name+".png");
    FileHandler.copy(source,dest);
	}
	
   
	
}