package randomScenarios;
//Test Id= TC35 Verify The tab Customization

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class VerifyTab extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		
		waitForPageElementToVisible(driver.findElement(By.id("AllTab_Tab")));
		driver.findElement(By.id("AllTab_Tab")).click();
		
		//waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='customize']")));
		driver.findElement(By.xpath("//input[@name='customize']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("duel_select_1")));
		Select remove= new Select(driver.findElement(By.id("duel_select_1")));
		remove.selectByVisibleText("Subscriptions");
		
		driver.findElement(By.xpath("//img[@class='leftArrowIcon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='save']")).click();
		
		Thread.sleep(3000);
		userLogOut();
		
		login();
		
	//Verify removed tab
		String r= "Subscriptions";
		WebElement rem=driver.findElement(By.id("duel_select_1"));
		if(rem.getText().trim().contains(r)) {
			System.out.println("Test case fail");
		}else
			System.out.println("Test case pass");
		
		
		
	}

}
