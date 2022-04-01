package testscripts;

import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillararyDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1() {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gerasButton();
	s.skillraryDemoapp();
	
	SkillararyDemoLoginPage sd=new SkillararyDemoLoginPage(driver);
	driverutilies.switchTabs(driver);
	driverutilies.mouseHover(driver,sd.getCoursetab());
	sd.seleniumtrainingbtn();
	
	AddtocartPage a=new AddtocartPage(driver);
	driverutilies.doubleClick(driver,a.getPlusbtn());
	a.addtocart();
	driverutilies.alertPopup(driver);
	}

}
