package fbRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
			this.driver=driver;
		   PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="email")
	WebElement mail;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"u_0_5_6/\"]")
	WebElement Login_Btn;
	
	public void login(String email,String pass)
	{
		mail.sendKeys(email);
		password.sendKeys(pass);
		Login_Btn.click();
	}

}
