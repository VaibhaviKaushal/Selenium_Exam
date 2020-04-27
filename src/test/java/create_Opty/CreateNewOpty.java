package create_Opty;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

// Test Id= TC16 Create a new Opty
public class CreateNewOpty extends BrowserUtility{

	public static void main(String[] args) throws Exception {
	
		launchBrowser("ch");
		login();
		opportunities();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("opp3")));
		driver.findElement(By.id("opp3")).sendKeys("Vaibhavi123");
		
		driver.findElement(By.xpath("//a[@id='opp4_lkwgt']//img[@class='lookupIcon']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
		Thread.sleep(2000);
//		driver.switchTo().frame("Vaibhavi T");
//		driver.findElement(By.xpath("//div[@class='listRelatedObject lookupBlock']"));
		driver.findElement(By.xpath("//a[contains(@class,'dataCell')]")).click();
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.id("opp9")).click();
		driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		Thread.sleep(2000);
		Select stage= new Select(driver.findElement(By.id("opp11")));
		stage.deselectByValue("Needs Analysis");
		WebElement ele=driver.findElement(By.id("opp12"));
		ele.clear();
		ele.sendKeys("10");
		
		Select leadSource= new Select(driver.findElement(By.id("opp6")));
		leadSource.selectByValue("Web");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='lookupIconOn']")).click();
		
		
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		
	}

}
