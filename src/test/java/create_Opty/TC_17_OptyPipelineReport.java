package create_Opty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test Id= TC17 Test opportunity Pipeline Report
public class TC_17_OptyPipelineReport extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		opportunities();
		
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
	
	System.out.println("Opportunity Pipelinne Report page is displayed");
	
	}

}
