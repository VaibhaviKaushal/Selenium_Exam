package contacts;
//Test Id= TC32 - Check the save and new button works in new contact page

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class SaveAndNewButton extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		contacts();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("name_lastcon2")));
		driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		
		driver.findElement(By.id("con4")).sendKeys("Global Media");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save_new']")).click();
		
		System.out.println("Testcase failed: \n" + driver.findElement(By.id("errorDiv_ep")).getText());
		
	}

}
