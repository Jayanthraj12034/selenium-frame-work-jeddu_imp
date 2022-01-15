package Generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_constatnts {
public	WebDriver driver;
	@BeforeMethod
	public void openAppl(){
		System.setProperty(Gecko_key, Gecko_value);
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@AfterMethod
	public void closeAppl(ITestResult res) throws IOException{
		if(ITestResult.FAILURE==res.getStatus()){
			Generic_screenshot.takescreenshot(driver);
	
		}
		
		driver.close();
	}

}
