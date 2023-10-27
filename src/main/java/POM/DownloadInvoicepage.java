package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicepage {
	
	//declaration
	//address of download invoice
	@FindBy(name="downloadInvoice")
	private WebElement downnloadInvoicebtn;
	
	//initialization
	public DownloadInvoicepage(WebDriver driver) {
	PageFactory.initElements(driver,this );
	}
//Utilization

	public WebElement getDownnloadInvoicebtn() {
		return downnloadInvoicebtn;
	}
//Business Library
	public void downloadinvoicebtn() {
		downnloadInvoicebtn.click();
	}

}
