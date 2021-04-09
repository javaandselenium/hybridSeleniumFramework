package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
private WebElement testingBtn;

@FindBy(id="mycart")
private WebElement cart;

public WebElement getTestingBtn() {
	return testingBtn;
}

public WebElement getCart() {
	return cart;
}
@FindBy(xpath="//i[@class='fa fa-facebook']")
private WebElement fb;

public TestingPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void fbicon() {
	fb.click();
}
}
