package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.Facebookpage;
import pomPages.SkillRaryLoginPage;
import pomPages.SkillraryDemoLogin;
import pomPages.TestingPage;

public class FaceBookLike extends BaseClass{
	@Test
	public void liketc2() throws FileNotFoundException, IOException {
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.gerasButton();
		s.skillraryDemoapp();
		
		utilies.switchTabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		utilies.dropDown(sd.getTestingdd(),p.getData("option"));
		
		TestingPage t=new TestingPage(driver);
		utilies.dragDropbtn(driver,t.getTestingBtn(),t.getCart());
		t.fbicon();
		
		Facebookpage f=new Facebookpage(driver);
		f.likebtn();
		
		
		utilies.verify(driver.getTitle(),p.getData("fbtitle"));
		
		
	}

}
