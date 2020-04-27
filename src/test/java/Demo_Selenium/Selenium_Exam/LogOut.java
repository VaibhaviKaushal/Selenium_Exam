package Demo_Selenium.Selenium_Exam;

import org.openqa.selenium.By;

//Test ID= TC09- LogOut usermenu
public class LogOut extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		userMenu();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		System.out.println("\nLogged out and Displayed Login page");
	}

}
