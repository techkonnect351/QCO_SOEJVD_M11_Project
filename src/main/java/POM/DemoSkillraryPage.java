package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	//declaration
//	address of select category
	@FindBy(name="addresstype")
	private WebElement selectdd;
	
	//address of feedback
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackBtn;
	
	
	//Why we are using private keyword?
	/*
	 * to achieve encapsulation and to achieve data hiding
	 */
	//initialization
	public DemoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
		
	}
//utilization

	public WebElement getSelectdd() {
		return selectdd;
	}

	public WebElement getFeedbackBtn() {
		return feedbackBtn;
	}

	//Business library
	public void feedbackBtn() {
		feedbackBtn.click();
	}

}


