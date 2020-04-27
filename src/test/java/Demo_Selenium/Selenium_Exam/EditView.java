package Demo_Selenium.Selenium_Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Test ID= TC12 Edit View
public class EditView extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		accounts();
		
		Thread.sleep(4000);
		Select listDropDown= new Select(driver.findElement(By.id("fcf")));
		listDropDown.selectByValue("00B5w00000CJ1gi");;
		
		driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.id("fname")));
		WebElement ele= driver.findElement(By.id("fname"));
		ele.clear();
		ele.sendKeys("Vaibhavi1");
		
		Select filterField= new Select(driver.findElement(By.id("fcol1")));
		filterField.selectByValue("ACCOUNT.NAME");
		
		Select operator= new Select(driver.findElement(By.id("fop1")));
		operator.selectByValue("c");
		
		driver.findElement(By.id("fval1")).sendKeys("Vi");
		
		WebElement selectField= driver.findElement(By.id("colselector_select_1"));
		System.out.println("Select Fields: \n"+ selectField.getText());
		String field= "Account Name";
		if(selectField.getText().contains(field)) {
			System.out.println("\n It displayed Account Name field");
		}else
			System.out.println("It did not display Account Name field");
		
		driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")).click();
	}

}
