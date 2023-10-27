package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillraryhomepage {
	//declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@placeholder='Search for Courses']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	//initialization
	public Skillraryhomepage(WebDriver driver) {
		PageFactory.initElements(driver,this );
		}
	
//utilization
	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	public WebElement getSearchTf() {
		return searchTf;
	}
	
	public WebElement getSearchicon() {
		return searchicon;
	}

	//Business Library
	public void gearsButton() {
		gearsbtn.click();
	}
	
	public void skillraryDemoApp() {
		skillrarydemoapp.click();
		
	}
	
	public void searchtextfield(String data) {
		searchTf.sendKeys(data);
	}
	
}
