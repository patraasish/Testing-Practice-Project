package com.app.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class DisplayNameOrderAnnotation {

	@Test
	@Order(1)
	@DisplayName("1. sign in")
	public void method1() {
		System.out.println("sign in");
	}
	
	@Test
	@Order(2)
	@DisplayName("2. login")
	public void method2() {
		
	}
	
	public void method3() {
		
	}
	
}
