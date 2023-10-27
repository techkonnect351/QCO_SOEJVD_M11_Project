package Scripts;

import org.testng.annotations.Test;

import Generic_Libraries.BaseClass;
import POM.DemoSkillraryPage;
import POM.DownloadInvoicepage;
import POM.Skillraryhomepage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() {
		Skillraryhomepage s=new Skillraryhomepage(driver);
		s.gearsButton();
		s.getSkillrarydemoapp();
		utilities.childbrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		ds.feedbackBtn();
		DownloadInvoicepage dI=new DownloadInvoicepage(driver);
		dI.downloadinvoicebtn();
		
	}

}
