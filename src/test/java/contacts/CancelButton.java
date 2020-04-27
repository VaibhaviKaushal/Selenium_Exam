package contacts;
//Test ID= TC31- Check the cancel button works fine in Create new view

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class CancelButton extends BrowserUtility {

	public static void main(String[] args) throws Exception {
	 launchBrowser("ch");
	 login();
	 contacts();
	 
	 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys("ABCD");
		driver.findElement(By.id("devname")).sendKeys("EFGH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='cancel']")).click();
		
		System.out.println("New View Contact is not Created");
	 
	}

}
