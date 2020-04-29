package contacts;
//Test Id= TC28 Check MyContacts view in the contact page

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class TC_28_CheckMyContacts extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		contacts();
		
		waitForPageElementToVisible(driver.findElement(By.id("fcf")));
		Select contacts= new Select(driver.findElement(By.id("fcf")));
		contacts.selectByValue("00B5w00000D5Hpq");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='go']")).click();
		System.out.println("My Contacts page is displayed ");
		
		
		
	}

}
