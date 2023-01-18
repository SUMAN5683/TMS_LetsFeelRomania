package com.ProjectMaven.SampleTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Update {
	@Test(groups = "smoke")
	public void updateTest() {
		Reporter.log("project updated");
	}
	@Test(groups = {"smoke","regression"})
	public void updatetestdata() {
		Reporter.log("project data updated",true);
		
	}


}
