package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.SeleniumPage;
import PomPages.SkillraryLoginPage;
import PomPages.Whishlistpage;
import genericLib.BaseClass;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.serachtextbox(pdata.getPropertyData("name"));
	s.serachbtn();
	
	SeleniumPage sel=new SeleniumPage(driver);
	sel.corejavaselenium();
	
	Whishlistpage w=new Whishlistpage(driver);
	driverutilies.switchToframes(driver);
	w.playbutton();
	Thread.sleep(10000);
	w.pausebutton();
	driverutilies.switchbackframe(driver);
	w.wishlistbtn();
	
	
	
	}

	

}
