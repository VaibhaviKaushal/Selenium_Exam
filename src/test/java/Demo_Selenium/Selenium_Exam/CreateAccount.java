package Demo_Selenium.Selenium_Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

// Test ID= TC10 Create Account
public class CreateAccount extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		login();
		
		accounts();
	
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("acc2")));
		driver.findElement(By.id("acc2")).sendKeys("Vaibhavi K");
		
		Select type= new Select(driver.findElement(By.id("acc6")));
		type.selectByValue("Technology Partner");
	
		Select customerPriority= new Select(driver.findElement(By.id("00N5w00000HPsFN")));
		customerPriority.selectByValue("High");
		
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		System.out.println("New Account page is displayed");
	}

}
