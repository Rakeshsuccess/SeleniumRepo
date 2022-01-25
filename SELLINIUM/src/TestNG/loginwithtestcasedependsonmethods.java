package TestNG;

import org.testng.annotations.Test;

public class loginwithtestcasedependsonmethods {
  @Test
  public void loginvlidcredential() {
	 int i=10/0;
	  System.out.println("log in valid user name ");	  
  }
  @Test(dependsOnMethods="loginvlidcredential")
  public void clickoncreatetask() {
	  System.out.println("log in valid user name ");	  
  }
}
