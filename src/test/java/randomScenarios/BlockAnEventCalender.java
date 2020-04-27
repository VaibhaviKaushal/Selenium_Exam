package randomScenarios;
//Test ID= TC37 Blocking an event in the calender with weekly recurrance

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class BlockAnEventCalender extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		home();
		
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		date.click();
		
		waitForPageElementToVisible(driver.findElement(By.id("p:f:j_id25:j_id61:20:j_id64")));
		driver.findElement(By.id("p:f:j_id25:j_id61:20:j_id64")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[@class='comboboxIcon']")));
		driver.findElement(By.xpath("//img[@class='comboboxIcon']")).click();
		
		ArrayList<String> windowTabs= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(windowTabs.get(1));
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Other')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(windowTabs.get(0));
		
		waitForPageElementToVisible(driver.findElement(By.id("EndDateTime_time")));
		driver.findElement(By.id("EndDateTime_time")).click();;
		driver.findElement(By.id("timePickerItem_38")).click();
		
		driver.findElement(By.id("IsRecurrence")).click();
		driver.findElement(By.id("rectypeftw")).click();
		driver.findElement(By.id("RecurrenceEndDateOnly")).click();
		driver.findElement(By.className("calRight")).click();
		driver.findElement(By.xpath("//*[@id=\"calRow3\"]/td[2]")).click();
		
		Thread.sleep(3000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")));
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
		
		
		
		
	}

}
