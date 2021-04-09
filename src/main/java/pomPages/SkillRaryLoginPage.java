package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement serachTb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	public SkillRaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gerasButton() {
		gerasBtn.click();
	}
	
	public void skillraryDemoapp() {
		demoapp.click();
	}
	
	public void sercahTextbox(String cousename) {
		serachTb.sendKeys(cousename);
	}
	
	public void gobutton() {
		gobtn.click();
	}
	

}
