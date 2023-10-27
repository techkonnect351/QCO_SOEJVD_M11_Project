package Scripts;

import org.testng.annotations.Test;

import Generic_Libraries.BaseClass;
import POM.DemoSkillraryPage;
import POM.Skillraryhomepage;
import POM.TestingPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1() throws Throwable {
		Skillraryhomepage s=new Skillraryhomepage(driver);
		s.gearsButton();
		s.getSkillrarydemoapp();
		utilities.childbrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utilities.dropdown(ds.getSelectdd(), pdata.getPropertydata("coursedd"));
		TestingPage t =new TestingPage(driver);
		utilities.Scrolling(driver,t.getFacebook());
		Thread.sleep(3000);
		t.FacebookWebElement();
	}
	

}
