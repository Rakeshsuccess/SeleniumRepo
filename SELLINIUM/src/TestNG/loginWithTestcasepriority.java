package TestNG;

import org.testng.annotations.Test;

public class loginWithTestcasepriority {
//annotattion empty thats time cases run in alphabeticaly order
	//but annotation get a pass priorities so somethigs any cases run as per priority
	@Test(priority=2)
	public void loginwithvalidcredential() {
		System.out.println("loginwithValidcredential");
	}
	@Test(priority=1)
	public void loginwithINvalidcredential() {
		System.out.println("loginwithINvalidcredential");

	}
	@Test(priority=3)
	public void loginwithEMPTYcredential() {
		System.out.println("loginwithEMPTYcredential");

	}

}
