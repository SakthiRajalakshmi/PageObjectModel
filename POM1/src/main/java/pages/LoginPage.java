package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.LeafTabMethod;

public class LoginPage extends LeafTabMethod  {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="username")
	WebElement eleLogUname;
	
	//method name-action+name of the element
	public LoginPage enterUsername() {
		eleLogUname.sendKeys("Demosalesmanager");
		//driver.findElement(By.id("username")).sendKeys(userN);
		return this;//to stay in same page "this" is used

	}
	@FindBy(how=How.ID,using="password")
	WebElement eleLogPname;
	public LoginPage enterPassword() {
		eleLogPname.sendKeys("crmsfa");
		//driver.findElement(By.id("password")).sendKeys(passW);
		return this;

	}
	public HomePage clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		//HomePage hp=new HomePage();//when ever going to new page object is created
		return new HomePage(driver); 

	}

}
