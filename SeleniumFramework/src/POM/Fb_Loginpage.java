package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generics.Base_page;

public class Fb_Loginpage extends Base_page {
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement usntxtfld;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement passwordtxt;
	
	@FindBy (xpath="//button[.='Log In']")
	private WebElement logbtn;
	
	public Fb_Loginpage(WebDriver driver )
	{
		super(driver);	
	}
	public void pauseUsn(String un)
	{
		usntxtfld.sendKeys(un);
	}
	public void pausePassword(String pwd)
	{
		passwordtxt.sendKeys(pwd);
	}
	public void clickLogbtn(){
		logbtn.click();
	}
}
