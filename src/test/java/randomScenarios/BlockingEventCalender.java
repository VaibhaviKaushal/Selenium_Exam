package randomScenarios;
//Test Id= TC36 Blockinng an evemt in the calender

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class BlockingEventCalender extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		home();
		
		//waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\\\"ptBody\\\"]/div/div[2]/span[2]/a")));
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		if(date.isDisplayed()) {
		System.out.println("Date is displayed");
	}else
		System.out.println("Date is not displayed");

		date.click();
		
		waitForPageElementToVisible(driver.findElement(By.id("p:f:j_id25:j_id61:28:j_id64")));
		driver.findElement(By.id("p:f:j_id25:j_id61:28:j_id64")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[@class='comboboxIcon']")));
		driver.findElement(By.xpath("//img[@class='comboboxIcon']")).click();
		
		ArrayList<String> windowTabs= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(windowTabs.get(1));
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Other')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(windowTabs.get(0));
		
		waitForPageElementToVisible(driver.findElement(By.id("EndDateTime_time")));
		driver.findElement(By.id("EndDateTime_time")).click();;
		driver.findElement(By.id("timePickerItem_42")).click();
		
		Thread.sleep(3000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")));
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
		
	
	}
}
