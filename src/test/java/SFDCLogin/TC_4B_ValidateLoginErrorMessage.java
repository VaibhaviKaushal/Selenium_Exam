package SFDCLogin;

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= Forgot Password- 4 B, 
public class TC_4B_ValidateLoginErrorMessage extends BrowserUtility {

	public static void main(String[] args) {
	launchBrowser("ch");
	
	waitForPageElementToVisible(driver.findElement(By.id("username")));
	driver.findElement(By.id("username")).sendKeys("123");
	driver.findElement(By.id("password")).sendKeys("22131");
	driver.findElement(By.id("Login")).click();
	
	String expectedErrorMessage= "Your login attempt has failed. The username or password may be incorrect, or your location or login time may be restricted. Please contact the administrator at your company for help";
	
	waitForPageElementToVisible(driver.findElement(By.id("error")));
	String actualErrorMessage= driver.findElement(By.id("error")).getText();
	System.out.println("Actual Error Message : "+ actualErrorMessage);
	if(actualErrorMessage.trim().equalsIgnoreCase(expectedErrorMessage)) {
		System.out.println("Test case pass");
	}else
		System.out.println("Test case fail");
	
	}

}
