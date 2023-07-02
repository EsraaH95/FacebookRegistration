package Tests;

    import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import fbRegistration.LoginPage;
import fbRegistration.RegistrationPage;
    import utilities.ReadCredentials;
    
public class TestCreateAccount extends TestBase {
	ReadCredentials dat=new ReadCredentials();
    Properties prop = dat.readPropertiesFile();
	String email=prop.getProperty("Email")+"@jourrapide.com";
	String firstName=prop.getProperty("FirstName");
	String surName=prop.getProperty("SecondName");
	String password=prop.getProperty("Password"); 
	String url=prop.getProperty("URL");
	
	
  @Test(priority=0)
  public void testCreateAccount() {
		RegistrationPage registobj=new RegistrationPage(driver);
	   registobj.complete_registration_form(firstName, surName, email,password);
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   //Assertion to check that the verification code layout displayed or not
     //  Assert.assertEquals(registobj.send_verification.getText(), "Send Email Again"); 
  }
  
  @Test(priority=1, dependsOnMethods={"testCreateAccount"} )
  public void testLogin()
  {
	  LoginPage LoginPageobj=new LoginPage(driver);

	  driver.navigate().to("url");
	  LoginPageobj.login(email, password);
  }
  

  
  	
  }

