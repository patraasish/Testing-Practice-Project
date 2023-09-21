package com.mypratice;

interface Test2{
	void method();
}

interface Test3{
	void method2();
	
	default void m3() {
		System.out.println("m3");
	}
	 
	 static void m4() {
		System.out.println("m4");
	}
	
}

public class InterfaceExample implements Test2,Test3 {

	public void method() {
		System.out.println("interface");
	}
	
	public void method2() {
		System.out.println("interface2");
	}
	
	public static void main(String[] args) {
		
		InterfaceExample obj= new InterfaceExample();
		obj.method();
		obj.method2();
		obj.m3();
		Test3.m4();

	}

}
