package Demo_Selenium.Selenium_Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Test ID= TC11 Create new View
public class CreateNewView extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		accounts();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys("Vi T");
		
		WebElement devname= driver.findElement(By.id("devname"));
		devname.clear();
		devname.sendKeys("Vaibhavi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
	}

}
