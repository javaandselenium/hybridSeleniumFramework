package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeCoursePage {
@FindBy(xpath="//div[@class='play-icon']")
private WebElement play;

@FindBy(xpath="//div[@class='pause-icon']")
private WebElement pause;

@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
private WebElement takecourse;

public TakeCoursePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void playbtn() throws InterruptedException {
	play.click();
	Thread.sleep(10000);
}

public void pausebtn() {
	pause.click();
}

public void enrollcourse() {
	takecourse.click();
}
}
