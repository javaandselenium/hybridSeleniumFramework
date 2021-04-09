package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpage {
	@FindBy(xpath="//button[text()='Like']")
	private WebElement like;
	
	public Facebookpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void likebtn() {
		like.click();
	}

}
