package leads;
//Test ID= TC24 Check "New" button on leads home

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class TC_24_NewButton extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		leads();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("name_lastlea2")));
		driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
		
		driver.findElement(By.id("lea3")).sendKeys("ABCD");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
		
		Thread.sleep(5000);
		
		userLogOut();
		Thread.sleep(3000);
		quitBrowser();
	}

}
