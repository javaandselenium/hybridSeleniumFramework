package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillRaryLoginPage;
import pomPages.SkillraryDemoLogin;

public class Addthecoursetocart extends BaseClass {
@Test
public void addtocart() throws InterruptedException, FileNotFoundException, IOException {
	
	SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
	s.gerasButton();
	s.skillraryDemoapp();
	
	utilies.switchTabs(driver);
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	utilies.mouseHover(driver,sd.getCousetab());
	sd.seleniumTrainingbtn();
	
	SeleniumTrainingPage st=new SeleniumTrainingPage(driver);
	utilies.doubleClickm(driver,st.getAddbtn());
	Thread.sleep(5000);
	st.addtocartbtn();
	Thread.sleep(5000);
	utilies.alertpopup(driver);
	utilies.verify(driver.getTitle(),p.getData("exptitle"));
	
	
	
	
	
	
}
}
