package fbRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmail {
	WebDriver driver;
	public CreateEmail(WebDriver driver)
	{
		this.driver=driver;
	   PageFactory.initElements(driver, this);
}
	 @FindBy(id="domain-select")
	 WebElement domainmenu;
	 
	 
	 @FindBy(linkText="@jourrapide.com")
	 WebElement domainName;
	 
	 @FindBy(id="home-email")
	 WebElement mail;
	 
//	 @FindBy(id="copy-button")
//	 WebElement copy_button;
	 
	 public void createEmail(String email)
	 {
		 domainmenu.click();
		 domainName.click();
		 mail.clear();
		 mail.sendKeys(email);
		 mail.submit();
	 }
	 
	 public void checkEmial(String email)
	 {
		 domainmenu.click();
		 domainName.click();
		 mail.clear();
		 mail.sendKeys(email);
		 mail.submit();
		 
	 }

}
