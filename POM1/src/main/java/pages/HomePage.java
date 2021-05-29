package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.LeafTabMethod;

public class HomePage extends LeafTabMethod  {
	
	public HomePage(ChromeDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	WebElement eleClickCrm;
	public MyHomePage clickCrmsfaLink() {
		
		
		eleClickCrm.click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		

	}

	
}
