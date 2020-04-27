package Demo_Selenium.Selenium_Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//Test Description=  TC05 Select user menu for <username> drop down
public class UsernameDropDown extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		login();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		String tooltip= "User menu for Vi T";
		WebElement usermenu=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		Actions act= new Actions(driver);
		act.moveToElement(usermenu).build().perform();
		System.out.println("Username : " + usermenu.getText());
		if(tooltip.trim().contains(tooltip)) {
			System.out.println("User menu Drop down is available");
		}else
			System.out.println("User menu Drop down is not available");
		
		usermenu.click();
		System.out.println();	
		waitForPageElementToVisible(driver.findElement(By.id("userNavMenu")));
		System.out.println("UserMenu dropdown :\n" +driver.findElement(By.id("userNavMenu")).getText());
		
		
	}

}
