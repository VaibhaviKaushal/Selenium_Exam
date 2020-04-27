package leads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= TC22-default view -Functonality of the Go Button
public class DefaultView extends BrowserUtility{

	public static void main(String[] args) throws Exception {
	launchBrowser("ch");
	login();
	leads();
	
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	Select leads= new Select(driver.findElement(By.id("fcf")));
	leads.selectByValue("00B5w00000D5Hp9");
	
	Thread.sleep(4000);
	userLogOut();
	
	login();
	
	waitForPageElementToVisible(driver.findElement(By.id("Lead_Tab")));
	driver.findElement(By.id("Lead_Tab")).click();
	waitForPageElementToVisible(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")));
	driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
	
	Thread.sleep(3000);
	quitBrowser();
	}

}
