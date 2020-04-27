package contacts;
//Test ID= TC 26 Create new view in the contact page

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class NewView extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		contacts();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys("Vaibhavi12");
		
		driver.findElement(By.id("devname")).sendKeys("Vi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
		System.out.println("New view in the contact page is created");
		
	}

}
