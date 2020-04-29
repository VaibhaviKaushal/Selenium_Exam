package leads;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;
import UserMenuDropDown.TC_9_LogOut;

//Test Id= TC21 Leads select view
public class TC_21_LeadsSelectView extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		login();
		leads();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> dropDown= driver.findElements(By.id("fcf"));
		for(int count=0; count<dropDown.size(); count++) {
			System.out.println("Leads Drop Down: \n" +dropDown.get(count).getText());
			}
		userLogOut();
		quitBrowser();
	}

}
