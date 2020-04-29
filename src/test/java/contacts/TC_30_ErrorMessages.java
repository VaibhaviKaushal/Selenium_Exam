package contacts;
//Test ID= TC30 - Check the error message, 
//if the required info is not entered while creating a new view in contacts

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class TC_30_ErrorMessages extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		contacts();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("devname")));
		driver.findElement(By.id("devname")).sendKeys("EFGH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
		Thread.sleep(4000);
		WebElement error= driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]"));
		System.out.println(error.getText());
		
		
	}

}
