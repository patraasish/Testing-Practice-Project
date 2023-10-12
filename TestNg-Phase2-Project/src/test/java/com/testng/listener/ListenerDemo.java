package com.testng.listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementClass.class)
public class ListenerDemo {

	
	@Test(priority='0')
	public void Method() {
		System.out.println("Execute method 1");
	}
	
	@Test(priority='1')
	public void Test2() {
		System.out.println("Execute method 2");
		Assert.assertTrue(false);
	}
	
	
}
