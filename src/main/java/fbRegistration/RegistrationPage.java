package fbRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver)
	{
			this.driver=driver;
		   PageFactory.initElements(driver, this);

	}
	
	@FindBy(linkText="Create new account")
	WebElement creat_btn;
   
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement SurName ;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement email_address;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	WebElement Confirm_email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	WebElement Password;
	
	@FindBy(xpath="//select[@id='day']")
	public WebElement select_day;
	
	@FindBy(xpath="//select[@id='month']")
	public WebElement select_month;
	
	@FindBy(xpath="//select[@id='year']")
	public WebElement select_year;
	
	@FindBy(xpath="//input[@type='radio'][1]")
	WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	WebElement SignUp_btn;
	
	@FindBy(linkText="Send Email Again")
	public WebElement send_verification;
	

	
	public void complete_registration_form(String First_name,String Surname,String e_mail,String pwd)
	{
		creat_btn.click();
		FirstName.sendKeys(First_name);
		SurName.sendKeys(Surname);
		email_address.sendKeys(e_mail);
		Confirm_email.sendKeys(e_mail);
		Password.sendKeys(pwd);	
		Select day=new Select(select_day);
		day.selectByValue("1");
		Select month=new Select (select_month);
		month.selectByVisibleText("Jan");
		Select year=new Select (select_year);
		year.selectByVisibleText("1995");
		gender.click();
		SignUp_btn.click();
		
	}
	
	
}
