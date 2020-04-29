package SFDCLogin;
//Test ID= Check Remember Me-3

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class TC_3_CheckRememberMe extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		
		
		waitForPageElementToVisible(driver.findElement(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("Vaibhavi.T@salesforce.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("rememberUn")).click();
		driver.findElement(By.id("Login")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNav-arrow']")));
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		
		// bug in this code 
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id=\"idcard-identity\"]")));
		String ele= driver.findElement(By.xpath("//span[@id=\"idcard-identity\"]")).getText();
		System.out.println("Username field Text: "+ ele );
		if(ele.trim().equalsIgnoreCase("vaibhavi.t@salesforce.com")) {
			System.out.println("Test case pass");
		}else
			System.out.println("Test case fail");
		
		
	
	}

}
