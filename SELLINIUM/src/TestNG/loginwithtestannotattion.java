package TestNG;

import org.testng.annotations.Test;

public class loginwithtestannotattion {

	@Test
	public void loginwithvalidcredential() {
		System.out.println("loginwithValidcredential");
	}

	@Test
	public void loginwithINvalidcredential() {
		System.out.println("loginwithINvalidcredential");

	}

	@Test
	public void loginwithEMPTYcredential() {
		System.out.println("loginwithEMPTYcredential");

	}
}