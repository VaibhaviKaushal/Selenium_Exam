package create_Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//TestID= TC13 Merge Accounts
public class TC_13_MergeAccounts extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		accounts();
		
waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();

waitForPageElementToVisible(driver.findElement(By.id("srch")));
driver.findElement(By.id("srch")).sendKeys("Vaibhavi");

driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();

waitForPageElementToVisible(driver.findElement(By.id("cid0")));
WebElement ele= driver.findElement(By.id("cid0"));
if(ele.isSelected()) {
System.out.println("It is selected");
}else
	ele.click();


WebElement ele1= driver.findElement(By.id("cid1"));
if(ele1.isSelected()) {
System.out.println("It is selected");
}else
	ele1.click();

driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]")).click();

waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]")));
driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]")).click();
driver.switchTo().alert().accept();
	}

}
