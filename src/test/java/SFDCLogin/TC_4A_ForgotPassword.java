package SFDCLogin;

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//test ID= Forgot Password-4 A
public class TC_4A_ForgotPassword extends BrowserUtility{

	public static void main(String[] args) {
		launchBrowser("ch");
	
		waitForPageElementToVisible(driver.findElement(By.id("forgot_password_link")));
		driver.findElement(By.id("forgot_password_link")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("un")));
		driver.findElement(By.id("un")).sendKeys("Vaibhavi.T@salesforce.com");
		
		driver.findElement(By.id("continue")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("forgotPassForm")));
		System.out.println(" Message Display : " +  driver.findElement(By.id("forgotPassForm")).getText());
	}

}
