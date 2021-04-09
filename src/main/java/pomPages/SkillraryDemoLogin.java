package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
@FindBy(id="course")
private WebElement cousetab;

@FindBy(name="addresstype")
private WebElement testingdd;

public WebElement getTestingdd() {
	return testingdd;
}

public WebElement getCousetab() {
	return cousetab;
}


@FindBy(xpath="//a[text()='Selenium Training']")
private WebElement seleniumtraing;
	

public SkillraryDemoLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void seleniumTrainingbtn() {
	seleniumtraing.click();
}
}

