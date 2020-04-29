package SFDCLogin;
//Test ID1 Login Error Message-1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo_Selenium.Selenium_Exam.ReadExcelFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1_LoginErrorMessage {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	

	WebDriverWait wait= new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
	WebElement username= driver.findElement(By.id("username"));
	ReadExcelFile excel= new ReadExcelFile("C:\\Users\\Kaushal\\eclipse-workspace\\Selenium_Exam\\Config\\Test Data.xlsx");
	String loginId= excel.getData(1, 2, 2);
	username.sendKeys(loginId);
	
	driver.findElement(By.id("password")).clear();
	
	driver.findElement(By.id("Login")).click();
	
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("error"))));
	String ele= driver.findElement(By.id("error")).getText();
	System.out.println("Error massage : " + ele);
	if(ele.trim().equalsIgnoreCase("Please enter your password.")) {
		System.out.println("Test case Pass");
	}else
		System.out.println("Test case Fail");
	}

}
