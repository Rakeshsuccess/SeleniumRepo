package TestNG;

import org.testng.annotations.Test;

public class testngtimeoutannotation {
@Test//(timeOut=2000)
public void timeoutannotation() throws InterruptedException {
	//Thread.sleep(3000);
	System.out.println("time out is annotation is passed or faill");
	
	
}
@Test//(timeOut=2000)
public void checkvalidusername() throws InterruptedException {
	//Thread.sleep(3000);

	System.out.println("passed the valid username and password");
	
	
}
}
