package create_Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test ID= TC14 create account Report
public class TC_14_CreateAccountReport extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		accounts();
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		
		
//There was popup alert one time, needed to check how to write this code, If pop up doesnt appear everytime.
		/*Thread.sleep(3000);
		 * WebElement alert= driver.findElement(By.id("ext-gen189"));
		 * if(alert.isDisplayed()) { alert.click(); }else
		 * driver.switchTo().activeElement();
		 */
		
		waitForPageElementToVisible(driver.findElement(By.id("ext-gen148")));
		
		WebElement datefield= driver.findElement(By.id("ext-gen148"));
		datefield.click();
		waitForPageElementToVisible(driver.findElement(By.className(".x-combo-list-item.x-combo-selected")));
		driver.findElement(By.className(".x-combo-list-item.x-combo-selected")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("ext-gen152")));
		driver.findElement(By.id("ext-gen152")).click();
		driver.findElement(By.id("ext-gen282")).click();
		
		driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
		driver.findElement(By.id("ext-gen295")).click();
		
		driver.findElement(By.id("ext-gen295")).click();
		waitForPageElementToVisible(driver.findElement(By.id("saveReportDlg_reportNameField")));
		driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("Vaibha");
		WebElement ele= driver.findElement(By.id("saveReportDlg_DeveloperName"));
		ele.clear();
		ele.sendKeys("Vaibhu");
		
		driver.findElement(By.id("ext-gen324")).click();
		
		
		
	}

}
