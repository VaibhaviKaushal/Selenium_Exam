package create_Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= TC11 Create new View
public class TC_11_CreateNewView extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		accounts();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys("Vi T");
		
		WebElement devname= driver.findElement(By.id("devname"));
		devname.clear();
		devname.sendKeys("Vaibhavi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
	}

}
