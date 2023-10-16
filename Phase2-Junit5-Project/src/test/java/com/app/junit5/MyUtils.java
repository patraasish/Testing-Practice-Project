package com.app.junit5;

public class MyUtils {

	public static boolean isPalindrome(String inputText) {

		String reverseText="";
		for (int i = inputText.length() - 1; i >= 0; i--) {

			reverseText = reverseText + inputText.charAt(i);
		}

		System.out.println(reverseText);
		if (inputText.equals(reverseText)) {
			return true;
		} else
			return false;

	}
	
	
}
