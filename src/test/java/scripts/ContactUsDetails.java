package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.ContactUs;
import pomPages.SeleniumPage;
import pomPages.SkillRaryLoginPage;
import pomPages.TakeCoursePage;

public class ContactUsDetails extends BaseClass{
@Test
public void contact() throws FileNotFoundException, IOException, InterruptedException {
	SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
	s.sercahTextbox(p.getData("course"));
	s.gobutton();
	
	SeleniumPage sp=new SeleniumPage(driver);
	sp.corejava();
	
	TakeCoursePage t=new TakeCoursePage(driver);
	utilies.frame(driver);
	t.playbtn();
	t.pausebtn();
	utilies.switchBackframe(driver);
	t.enrollcourse();
	
	ContactUs c=new ContactUs(driver);
	
	utilies.scrollBar(driver,c.getContactus());
	Thread.sleep(3000);
	c.cotactusbtn();
	c.fullnametb(p.getData("name"));
	c.emailtb(p.getData("email"));
	c.subjecttb(p.getData("sub"));
	c.messagetb(p.getData("msg"));
	c.sendusemailbtn();
	
	utilies.verify(driver.getTitle().trim(),p.getData("exptitlecontactus"));
	
}
}


