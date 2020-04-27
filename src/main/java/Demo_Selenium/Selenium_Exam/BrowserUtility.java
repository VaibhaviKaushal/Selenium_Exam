package Demo_Selenium.Selenium_Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	public static WebDriver driver = null;

	public static void launchBrowser(String sBrowser) {

		if (sBrowser.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			System.out.println("You have not given Browser correctly");
		}
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
	}
	public static void login() throws Exception {
		driver.findElement(By.id("username")).sendKeys("Vaibhavi.T@salesforce.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		
	}
	public static void userLogOut() {
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
	}
	
	
	public static void quitBrowser() {
		driver.quit();
	}
	public static void waitForPageElementToVisible(WebElement eleToWait) {
		WebDriverWait wait= new WebDriverWait(BrowserUtility.driver,30);
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
	}
	public static void userMenu() {
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		System.out.println("UserMenu dropdown options:\n" + driver.findElement(By.id("userNavMenu")).getText());
	}
	public static void accounts() throws Exception {
		waitForPageElementToVisible(driver.findElement(By.id("Account_Tab")));
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("tryLexDialog"));
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.id("tryLexDialogX")).click();
		}
		
	public static void opportunities() throws Exception {
		waitForPageElementToVisible(driver.findElement(By.id("Opportunity_Tab")));
		driver.findElement(By.id("Opportunity_Tab")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("tryLexDialogX")).click();
	}
	public static void leads() throws Exception {
		waitForPageElementToVisible(driver.findElement(By.id("Lead_Tab")));
		driver.findElement(By.id("Lead_Tab")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("tryLexDialogX")).click();
	}
	public static void contacts() throws Exception {
		waitForPageElementToVisible(driver.findElement(By.id("Contact_Tab")));
		driver.findElement(By.id("Contact_Tab")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("tryLexDialogX")).click();
	}
	public static void home() throws Exception {
		waitForPageElementToVisible(driver.findElement(By.id("home_Tab")));
		driver.findElement(By.id("home_Tab")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("tryLexDialogX")).click();
	}
	
		
	}
	


