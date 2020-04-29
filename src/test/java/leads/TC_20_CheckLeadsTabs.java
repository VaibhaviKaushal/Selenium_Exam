package leads;

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= TC20 Check leads tab link

public class TC_20_CheckLeadsTabs extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		login();
		leads();
		userLogOut();
		quitBrowser();
	}

}
