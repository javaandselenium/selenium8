package testscripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillararyDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLib.BaseClass;

public class Testcase2 extends BaseClass{

	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillraryDemoapp();
		
		SkillararyDemoLoginPage sd=new SkillararyDemoLoginPage(driver);
		driverutilies.switchTabs(driver);
		driverutilies.dropDown(sd.getDropdown(),pdata.getPropertyData("coursename"));
		
		TestingPage t=new TestingPage(driver);
		driverutilies.dragdrop(driver,t.getSeleniumtraining(),t.getCartbtn());
		
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.scrollBar(driver, x, y);
		t.facebookIcon();
	}

}
