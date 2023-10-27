package Generic_Libraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	//handling doubleclick
		public void doubleclick(WebDriver driver,WebElement ele) {
			Actions a =new Actions(driver);
			a.doubleClick(ele).perform();
			
		}
		//handling rightclick
		public void rightclick(WebDriver driver,WebElement ele) {
			Actions a=new Actions(driver);
			a.contextClick(ele).perform();
		}
       //dragand drop
		public void draganddrop(WebDriver driver,WebElement block1,WebElement block4) {
			Actions a=new Actions(driver);
			a.dragAndDrop(block1, block4).perform();
		}
		//mousehover
		public void mousehovering(WebDriver driver,WebElement ele) {
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
		}
		// Handling Scrolling 
		public void Scrolling(WebDriver driver, WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].scrollIntoView();", ele);
			}
		//handling frames
		public void frame(WebDriver driver,String value) {
			driver.switchTo().frame(value);
			
		}
		//handling popup
		public void popup(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		//handling default content
	    public void frames(WebDriver driver) {
	    	driver.switchTo().defaultContent();
	    	
	    }	
	    //child browser
	    public void childbrowser(WebDriver driver) {
	    	Set<String>child=driver.getWindowHandles();
	    	for(String b:child) {
	    		driver.switchTo().window(b);
	    	}
	    	
	    }
	    //handle dropdown
	    public void dropdown(WebElement ele, String text) {
	    	Select s=new Select(ele);
	    	s.selectByVisibleText(text);
	    	
	    }
		
}
