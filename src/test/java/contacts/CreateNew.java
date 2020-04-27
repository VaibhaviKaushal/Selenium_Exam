package contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//TC25 Create new Contact
public class CreateNew extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		contacts();
				
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("name_lastcon2")));
		driver.findElement(By.id("name_lastcon2")).sendKeys("Taretiya");
		
		driver.findElement(By.id("con4")).sendKeys("Vaibhavi T");
			
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
		
		System.out.println("New Contact is created");
		
	}

}
