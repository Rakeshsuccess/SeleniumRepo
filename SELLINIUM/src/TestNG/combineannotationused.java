package TestNG;

import org.testng.annotations.Test;

public class combineannotationused {
	//combine annotattion used
	
	@Test(description="TC 1:login with valid credentioal",priority=2,enabled=true,timeOut=3000)
	 public void loginvlidcredential() {
		 int i=10/2;
		  System.out.println("log in valid user name ");	  
	  }
	  @Test(description="TC 2:task creation",dependsOnMethods="loginvlidcredential",priority=1,enabled=true,timeOut=20000)
	  public void clickoncreatetask() {
		  System.out.println("create task is completed");	  
	  }
}
