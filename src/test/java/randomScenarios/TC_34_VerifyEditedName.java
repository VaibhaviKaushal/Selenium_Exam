package randomScenarios;
//Test ID= TC34 - Verify the editedd lastname is updated at various places

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class TC_34_VerifyEditedName extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		home();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")));
		driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")).click();

		driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(3000);
		driver.findElement(By.id("aboutTab")).click();
		waitForPageElementToVisible(driver.findElement(By.id("lastName")));
		WebElement lastnameEdit = driver.findElement(By.id("lastName"));
		lastnameEdit.clear();
		lastnameEdit.sendKeys("Abcd");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
		
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		System.out.println("Updated Lastname : "+ ele.getText());
		if(ele.getText().trim().equalsIgnoreCase("Vi Abcd")){
			System.out.println("Test case pass");
		}else
			System.out.println("Test case fail");
		
	}

}
