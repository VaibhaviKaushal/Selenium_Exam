package randomScenarios;
//Test Id= TC33 - Verify if the firstname and Lastname of the loggedin user is

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

public class TC_33_VerifyFnameLname extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
	
		home();
		
		String name= "Vi Taretiya";
		WebElement check= driver.findElement(By.xpath("//a[contains(text(),'Vi Taretiya')]"));
		if(check.getText().trim().equalsIgnoreCase(name)) {
			System.out.println("Test case pass");
		}else
			System.out.println("Test case Fail");
		
			
		waitForPageElementToVisible(check);
		check.click();
		
	}

}
