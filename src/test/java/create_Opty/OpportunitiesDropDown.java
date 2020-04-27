package create_Opty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Demo_Selenium.Selenium_Exam.BrowserUtility;

//Test Id= TC15 Opportunities drop down
public class OpportunitiesDropDown extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		opportunities();

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

List<WebElement> oppoDropDown= driver.findElements(By.id("fcf"));
for(int count=0; count<oppoDropDown.size(); count++) {
	System.out.println("Opportunities Drop Down: \n" +oppoDropDown.get(count).getText());
	System.out.println("\n Opportunities drop down is available");
	}


System.out.println("\n Opportunities drop down is available");
	}

}
