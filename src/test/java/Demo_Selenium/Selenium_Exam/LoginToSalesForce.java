package Demo_Selenium.Selenium_Exam;
//Test ID= Login To SalesForce-2

import org.openqa.selenium.By;

public class LoginToSalesForce extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		
		waitForPageElementToVisible(driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("Vaibhavi.T@salesforce.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
		
	}

}
