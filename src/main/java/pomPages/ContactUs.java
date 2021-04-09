package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	@FindBy(xpath="//a[contains(text(),' Contact Us ')]")
	private WebElement contactus;
	
	@FindBy(name="name")
	private WebElement fullname;
	
	@FindBy(name="sender")
	private WebElement email;
	
	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(name="message")
	private WebElement msg;
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendusemail;
	
	public ContactUs(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void fullnametb(String name) {
		fullname.sendKeys(name);
	}
	
	public void emailtb(String emailaddress) {
		email.sendKeys(emailaddress);
	}
	
	
	public void cotactusbtn() {
		contactus.click();
	}
	public void subjecttb(String sub) {
		subject.sendKeys(sub);
	}
	
	public void messagetb(String mssg) {
		msg.sendKeys(mssg);
	}
	
	public void sendusemailbtn() {
		sendusemail.click();
	}


	public WebElement getContactus() {
		return contactus;
	}

}
