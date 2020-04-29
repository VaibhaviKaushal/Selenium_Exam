package leads;
//Test ID= TC23 List item"today's leads" work
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;


public class TC_23_ListItem extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		leads();
		
		waitForPageElementToVisible(driver.findElement(By.id("fcf")));
		Select leads= new Select(driver.findElement(By.id("fcf")));
		leads.selectByValue("00B5w00000D5Hp9");
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")));
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		
		Thread.sleep(3000);
		userLogOut();
		Thread.sleep(2000);
		quitBrowser();
	}

}
