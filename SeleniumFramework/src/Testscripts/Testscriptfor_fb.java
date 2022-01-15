package Testscripts;

import org.testng.annotations.Test;

import Generics.Base_test;
import Generics.Generic_read_exel;
import POM.Fb_Loginpage;

public class Testscriptfor_fb extends Base_test {

	@Test
	public void Script() 
	{
		String usn = Generic_read_exel.getData("Sheet1", 0, 0);
		String pw = Generic_read_exel.getData("Sheet1", 0, 1);
		Fb_Loginpage fb=new Fb_Loginpage(driver);
		fb.pauseUsn(usn);
		fb.pausePassword(pw);
		fb.clickLogbtn();
		
		
		
		
	
		
		
		
	}
}
