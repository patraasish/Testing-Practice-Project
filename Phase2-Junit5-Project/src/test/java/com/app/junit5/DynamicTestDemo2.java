package com.app.junit5;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestDemo2 {

	@TestFactory
	public  Stream<DynamicTest> dynamicTestForPallindrome()// here DynamicTest is class generating testcase at runtime
	{
		return Stream.of("pop","mom","dad","madam")
					 .map(inputText -> 
					 DynamicTest.dynamicTest(inputText, 
							 ()->Assertions.assertTrue(MyUtils.isPalindrome(inputText))
							 )
				);
	}
}
