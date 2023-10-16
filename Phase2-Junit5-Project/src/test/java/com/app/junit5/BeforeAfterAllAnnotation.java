package com.app.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {
	
	JavaOperations obj;
	
	@BeforeAll // execute the init() method before each test method
	public  void init() {   // pre condition method
		System.out.println("Start Db connection");
		 obj = new JavaOperations();
		 System.out.println("Initalization done..");
	}
	
	
	@AfterAll // execute teardown() method after each test method
	public void teardown()  // post condition method
	{
		System.out.println("close DB connection");
	}
	
	@Test
	public void test1()
	{
		// create an object of a class and then execute the code
		System.out.println("Execute the test case using methods of ... JavaOperations");
		
	}
	
	@Test
	public void test2()
	{
		// create an object of a class and then execute the code
		System.out.println("Execute the test case using methods of ... JavaOperations");
		
	}

}
