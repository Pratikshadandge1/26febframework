package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(xpath="//img[@alt='Kite']")private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	
	@FindBy(xpath="//input [@type='text']")private WebElement usernameTextbox;
	@FindBy(xpath="//input [@type='password']")private WebElement passwordTextbox;
	@FindBy(xpath="//button [@type='submit']")private WebElement loginbtn;
	@FindBy(xpath="//input[@type='password']")private WebElement pinTextbox;
	@FindBy(xpath="//button[@type='submit']")private WebElement continuebtn; 
	@FindBy(xpath="//span[@class='nickname']")private WebElement nicknameLable;
	
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifytitle() {
		
		return driver.getTitle();
	}
	
	public boolean verifykitelogo()
	{
		return kiteLogo.isDisplayed();
	}
	public boolean verifyzerodhalogo()
	{
		return zerodhaLogo.isDisplayed();
	}



public String loginToApp() throws InterruptedException, IOException
{
	usernameTextbox.sendKeys(readpropertyfile("username"));
   passwordTextbox.sendKeys(readpropertyfile("password"));
   loginbtn.click();
	Thread.sleep(2000);
	
	pinTextbox.sendKeys(readpropertyfile("pin"));
	Thread.sleep(2000);
	continuebtn.click();
	Thread.sleep(2000);
	 return nicknameLable.getText();
}




}