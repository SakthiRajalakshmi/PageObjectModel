package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.LeafTabMethod;

public class ViewPage extends LeafTabMethod {
	
	public ViewPage(ChromeDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	WebElement eleviewFirstName;
	public ViewPage viewFirstName() {
		
		//System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());	
		System.out.println(eleviewFirstName.getText());
		return this;

	}

}
