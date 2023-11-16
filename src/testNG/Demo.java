package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	void test() {
		Reporter.log("1",true);
	}

}

