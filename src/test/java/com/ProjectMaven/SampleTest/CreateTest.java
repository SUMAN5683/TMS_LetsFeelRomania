package com.ProjectMaven.SampleTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateTest {
	@Test(groups = "smoke")
	public void createTest() {
		System.out.println("project created");
	}
	@Test(groups = {"smoke","regression"})
	public void update() {
		Reporter.log("project updated",true);
		
	}

}
