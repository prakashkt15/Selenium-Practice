package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	void run() {
		Reporter.log("running", true);
	}
}
