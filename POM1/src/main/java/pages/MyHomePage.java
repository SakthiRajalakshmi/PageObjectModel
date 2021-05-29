package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.LeafTabMethod;

public class MyHomePage extends LeafTabMethod{
	
	public MyHomePage(ChromeDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement eleLogUname;
	public MyLeadPage clickLeadButton() {
		
		//driver.findElement(By.linkText(prop.getProperty("MyHomePage.Leads.LinkText"))).click();
		eleLogUname.click();
		
		return new MyLeadPage(driver);

	}

}
