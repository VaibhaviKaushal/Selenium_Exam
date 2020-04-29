package create_Opty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= TC18 Test Stuck Opportunity Report
public class TC_18_stuckOpportunityReport extends BrowserUtility{

	public static void main(String[] args) throws Exception {
	launchBrowser("ch");
	login();
	opportunities();
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
	
	System.out.println("Stuck Opportunity Report page is displayed");
	}

}
