package create_Opty;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= TC19 Test Quarterly Summary Report
public class TC_19_SummaryReport extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		opportunities();
		
		Select interval= new Select(driver.findElement(By.id("quarter_q")));
		interval.selectByValue("current");
		
		Select include= new Select(driver.findElement(By.id("open")));
		include.selectByValue("all");
		
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']")));
		driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']")).click();
	}

}
