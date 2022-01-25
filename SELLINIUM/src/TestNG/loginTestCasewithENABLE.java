package TestNG;

import org.testng.annotations.Test;

public class loginTestCasewithENABLE {
	
	//without comment used enabled annotation
	
	
@Test(enabled=true)
public void loginwithvaliduser() {
	System.out.println("loginwithvaliduser is passed");
}
@Test(enabled=false)
public void createtask() {
	System.out.println("createtask is complete");
}


}
