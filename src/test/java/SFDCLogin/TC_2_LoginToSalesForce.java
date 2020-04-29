package SFDCLogin;
//Test ID= Login To SalesForce-2

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;
import Demo_Selenium.Selenium_Exam.ReadExcelFile;

public class TC_2_LoginToSalesForce extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		waitForPageElementToVisible(driver.findElement(By.id("username")));
		WebElement username=driver.findElement(By.id("username"));
		
		ReadExcelFile excel= new ReadExcelFile("C:\\Users\\Kaushal\\eclipse-workspace\\Selenium_Exam\\Config\\Test Data.xlsx");
		
		username.sendKeys(excel.getData(1, 3, 2));
		WebElement password=driver.findElement(By.id("password"));
		username.sendKeys(excel.getData(1,3,3));
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
		
	}

}
