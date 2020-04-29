package UserMenuDropDown;

// Test ID= My profile option dropDown TC06.
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class TC_6_MyProfileDropDown extends BrowserUtility {

	public static void main(String[] args) throws Exception {

		launchBrowser("ch");
		login();
		userMenu();
		
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		System.out.println("My Profile page is displayed");

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")).click();
		// edit lastname
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(3000);
		driver.findElement(By.id("aboutTab")).click();
		waitForPageElementToVisible(driver.findElement(By.id("lastName")));
		WebElement lastnameEdit = driver.findElement(By.id("lastName"));
		lastnameEdit.clear();
		lastnameEdit.sendKeys("Taretiya");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".zen-btn.zen-primaryBtn.zen-pas")).click();
		driver.switchTo().frame(0);
		System.out.println("Edit last name sucessfully");
		
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]"));
		Thread.sleep(3000);
		driver.switchTo()
		.frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		WebElement postText = driver.findElement(By.cssSelector("body"));
		
		Thread.sleep(3000);
		postText.sendKeys("Hi there!!!");
		System.out.println("Text posted successfully");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		

		waitForPageElementToVisible(driver
				.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")));
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")).click();

		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")));
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();

		driver.findElement(By.id("chatterFile")).sendKeys("C:\\Users\\Kaushal\\Downloads\\SFDC 37 Testcases.xlsx");

		Thread.sleep(3000);
		driver.findElement(By.id("publishersharebutton")).click();
		System.out.println("File uploaded successfully");

		WebElement photoClick = driver.findElement(By.id("displayBadge"));
		Actions actPhoto = new Actions(driver);
		actPhoto.moveToElement(photoClick).click().build().perform();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
		WebElement uploadPhoto = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		uploadPhoto.sendKeys("C:\\Users\\Kaushal\\Downloads\\Jenkins.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
		System.out.println("Image uploaded successfully");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']")), 0, 0);
		driver.findElement(By.id("j_id0:j_id7:save")).click();
		driver.switchTo().defaultContent();

	}

}
