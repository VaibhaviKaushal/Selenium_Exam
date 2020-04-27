package contacts;
//Test Id= TC27 Check recently created contact in the Contact page

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class CheckRecentCreate extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		contacts();
		
		waitForPageElementToVisible(driver.findElement(By.id("hotlist_mode")));
		Select recentView= new Select(driver.findElement(By.id("hotlist_mode")));
		Thread.sleep(3000);
		recentView.deselectByValue("2");
		
		
		
	}

}
