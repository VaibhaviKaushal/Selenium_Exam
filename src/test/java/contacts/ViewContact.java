package contacts;
//Test Id= TC29- View a contact in the contact page

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class ViewContact extends BrowserUtility {

	public static void main(String[] args) throws Exception {
	 launchBrowser("ch");
	 login();
	 contacts();
	 
	 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Taretiya')]")));
	 driver.findElement(By.xpath("//a[contains(text(),'Taretiya')]")).click();
	 
	 System.out.println("Contact details page is displayed");
	}

}
