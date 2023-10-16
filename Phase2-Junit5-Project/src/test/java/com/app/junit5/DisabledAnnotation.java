package com.app.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Functionalty is not working, ignoring the tests")
public class DisabledAnnotation {

	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Disabled
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void Test3() {
		System.out.println("Test3");
	}
}
