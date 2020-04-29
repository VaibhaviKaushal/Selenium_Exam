package UserMenuDropDown;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= TC08- Developers console option from User menu for username
public class TC_8_DevelopersConsoleUserMenu extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		userMenu();
		
		driver.findElement(By.xpath("//a[contains(@class,'debugLogLink menuButtonMenuLink')]")).click();
		System.out.println("Developer Console window is displayed");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ArrayList<String> windowTabs= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(windowTabs.get(1));
		
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(windowTabs.get(0));
		
	
	}

}
