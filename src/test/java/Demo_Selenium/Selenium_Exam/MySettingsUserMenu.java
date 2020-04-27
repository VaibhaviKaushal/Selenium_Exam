package Demo_Selenium.Selenium_Exam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MySettingsUserMenu extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		userMenu();

		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		System.out.println("My Settings page is displayed");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("PersonalInfo_font")).click();
		waitForPageElementToVisible(driver.findElement(By.id("LoginHistory_font")));
		driver.findElement(By.id("LoginHistory_font")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		System.out.println("Login History file is downloaded in .csv format successfully");
		
		driver.findElement(By.id("DisplayAndLayout_font")).click();
		waitForPageElementToVisible(driver.findElement(By.id("CustomizeTabs_font")));
		driver.findElement(By.id("CustomizeTabs_font")).click();
		
		Thread.sleep(3000);
		Select tabs= new Select(driver.findElement(By.id("p4")));
		tabs.selectByVisibleText("Salesforce Chatter");
		

		waitForPageElementToVisible(driver.findElement(By.id("duel_select_0")));
		WebElement scrollTabs= driver.findElement(By.id("duel_select_0"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",scrollTabs);
		
		driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@class,'rightArrowIcon')]")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		
		System.out.println("Reports tab added to selected tabs successfully");
		Thread.sleep(3000);
		driver.findElement(By.id("EmailSetup_font")).click();
		waitForPageElementToVisible(driver.findElement(By.id("EmailSettings_font")));
		driver.findElement(By.id("EmailSettings_font")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("sender_name")));
		WebElement emailname= driver.findElement(By.id("sender_name"));
		emailname.clear();
		emailname.sendKeys("vaibhavi T");
		
		WebElement emailAddress= driver.findElement(By.id("sender_email"));
		emailAddress.clear();
		emailAddress.sendKeys("vaibhavit.qa@gmail.com");
		
		driver.findElement(By.id("auto_bcc1")).click();
		driver.findElement(By.id("auto_bcc1")).isSelected();
		
		driver.findElement(By.xpath("//input[@name='save']")).click();
		System.out.println("Email Settings saved successfully");
		
		Thread.sleep(3000);
		driver.findElement(By.id("CalendarAndReminders_font")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("Reminders_font")));
		driver.findElement(By.id("Reminders_font")).click();

		waitForPageElementToVisible(driver.findElement(By.id("testbtn")));
		driver.findElement(By.id("testbtn")).click();
		System.out.println("Sample Event pop window is Displayed");
	
	
	}

}
