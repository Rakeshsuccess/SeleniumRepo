package TestNGgroupsAnnotation;

import org.testng.annotations.Test;

public class groupsannotation {
	@Test(groups = "smoke")
	public void tcfirst() {
		System.out.println("smoke tcfirst");
	}

	@Test(groups = "smoke")
	public void tcsecond() {
		System.out.println("smoke tcsencond");
	}

	@Test(groups = "regression")
	public void tcthird() {
		System.out.println("regrassiion tc third");
	}

	@Test(groups = "regression")
	public void tcforth() {
		System.out.println("regrassiion tc forth");
	}

	@Test(groups = "sanity")
	public void tcfive() {
		System.out.println("sanity tc five");
	}

	@Test(groups = "sanity")
	public void tcsix() {
		System.out.println("sanity tc six");
	}

	@Test(groups = "sanity")
	public void tcseven() {
		System.out.println("sanity tc seven");
	}
}
