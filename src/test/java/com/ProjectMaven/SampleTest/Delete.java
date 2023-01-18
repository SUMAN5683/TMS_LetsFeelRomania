package com.ProjectMaven.SampleTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Delete {
	@Test(groups = "regression")
	public void deleteTest() {
		Reporter.log("project deleted",true);
	}
	@Test(groups = "smoke")
	public void deleteTestData() {
		Reporter.log("project data deleted",true);
		
	}


}
