package com.app.junit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {

	@RepeatedTest(3)
	public void Test() {
		System.out.println("Check Repeated Test");
	}
	
	@Test
	public void AssumptionsDemo()
	{
		// i want to run the test case sonly and only if my DB server is Up and running
		
		boolean isDBServerUp = true;
		
		Assumptions.assumeTrue(isDBServerUp,"server is not Up");
		
		System.out.println("Create tables and inster data");
		
	}
	
}
