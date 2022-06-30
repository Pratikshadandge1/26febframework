package Pages;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {

	
	@FindBy(xpath="//div[@class='avatar']")private WebElement avtarIcon;
	@FindBy(xpath="//h4[@class='username']")private WebElement username;
   @FindBy(xpath="")private WebElement email;
   
   
   
     @FindBy(xpath="//button[text()='Start investing ']")private WebElement startInvestbtn;
   @FindBy(xpath="(//input[@type='text'])[2]")private WebElement searchbar;
   @FindBy(xpath="//span[@class='tradingsymbol']")private WebElement selectshare;
   @FindBy(xpath="//button[text()='Create GTT ']")private  WebElement createGTTbtn ;
   @FindBy(xpath="//input[@label='Trigger price']")private WebElement triggerpriceTextbox;
  @FindBy(xpath="//input[@label='Qty.']")private WebElement qtytextbox;
   @FindBy(xpath="//input[@label='Price']")private WebElement pricetextbox;
   @FindBy(xpath="//button[normalize-space(text())='Cancel']")private WebElement canclebtn;
//div[@class='email']
public DashboardPage() {
	
	PageFactory.initElements(driver, this);
}
  public String verifyusername() throws InterruptedException {
	  avtarIcon.click();
	  Thread.sleep(2000);
	  return username.getText();
  }
   public String verifyemail () throws InterruptedException {
	
	avtarIcon.click();
	 Thread.sleep(2000);
	 return email.getText();
}

public void pageGTTorder() throws InterruptedException, EncryptedDocumentException, IOException {
	
    startInvestbtn.click();
	Thread.sleep(2000);
	//searchbar.sendKeys("Infy");
	searchbar.sendKeys(readexcelfile ( 0 ,0));

	Thread.sleep(2000);
	selectshare.click();
	Thread.sleep(2000);
	createGTTbtn.click();
	Thread.sleep(2000); 
	triggerpriceTextbox.clear();
	Thread.sleep(2000); 
	triggerpriceTextbox.sendKeys(readexcelfile(0,1));
	Thread.sleep(2000);
	qtytextbox.clear();
	Thread.sleep(2000);
	qtytextbox.sendKeys(readexcelfile(0,2));
	Thread.sleep(2000);
	pricetextbox.clear();
	Thread.sleep(2000);
	pricetextbox.sendKeys(readexcelfile(0,3));
	Thread.sleep(2000);
	canclebtn.click();
}

}
