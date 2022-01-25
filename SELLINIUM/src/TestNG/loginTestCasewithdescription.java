package TestNG;

import org.testng.annotations.Test;

public class loginTestCasewithdescription {
	//USED description annotation described the passed testcase
	
	@Test(description = "login valid user credentioal")
	public void loginwithvalidcredential() {
		System.out.println("loginwithValidcredential");
	}

	@Test(description = "Alogin INVALID user credentioal")
	public void loginwithINvalidcredential() {
		System.out.println("loginwithINvalidcredential");

	}

	@Test(description = "EMPTY credentioal")
	public void loginwithEMPTYcredential() {
		System.out.println("loginwithEMPTYcredential");

	}
}
