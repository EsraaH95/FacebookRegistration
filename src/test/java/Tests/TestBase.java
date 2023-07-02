package Tests;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadCredentials;

public class TestBase {
	
	public static WebDriver driver=null;
	ReadCredentials  dat =new ReadCredentials();
	Properties prop = dat.readPropertiesFile();
	String driver_name=prop.getProperty("driver_name");
	String url=prop.getProperty("URL");
	
 
  @BeforeTest
  public void beforeTest() {
	  
	  if (driver_name.contentEquals("Chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\esraa\\eclipse-workspace\\fbRegistration\\Sources\\Drivers\\chromedriver.exe");
		  	TestBase.driver=new ChromeDriver();
	  		  WebDriverManager.chromedriver().setup();
	  		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  		  driver.navigate().to(url);
	  
  }
	  if (driver_name.contentEquals("fireFox"))
	  {
		  //WebDriver driver =new FirefoxDriver();
	        System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	        TestBase.driver= new FirefoxDriver();
	  		  WebDriverManager.firefoxdriver().setup();
	  		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  		  driver.navigate().to(url);
	  }

  }
  
  @AfterTest
	//Test cleanup
	public void TeardownTest()
  {
      driver.quit();
  }
}
