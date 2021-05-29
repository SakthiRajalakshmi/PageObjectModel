package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.LeafTabMethod;

public class CreateLeadPage extends LeafTabMethod {
	
	public CreateLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement elecName;
	
	public CreateLeadPage enterCompanyName(String cName) {
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		elecName.sendKeys(cName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement elefName;
	public CreateLeadPage enterFirstName(String fName) {
		
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		elefName.sendKeys(fName);
		return this;

	}@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement elelName;
	public CreateLeadPage enterLastName(String lName) {
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		elelName.sendKeys(lName);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	WebElement elesub;
	public ViewPage clickCreateLeadButton() {
		
		//driver.findElement(By.name("submitButton")).click();
		elesub.click();
		return new ViewPage(driver);

	}

}
