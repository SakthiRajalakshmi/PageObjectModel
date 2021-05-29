package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.LeafTabMethod;

public class MyLeadPage extends LeafTabMethod{
	
	public MyLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement eleCreateLead;
	public CreateLeadPage clickCreateLead() {
		//driver.findElement(By.linkText(prop.getProperty("MyLeadPage.CreateLead.LinkText"))).click();
		eleCreateLead.click();
		return new CreateLeadPage(driver);
		
		
	}
	
}
