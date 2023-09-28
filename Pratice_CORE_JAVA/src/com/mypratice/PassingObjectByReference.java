package com.mypratice;


class Test{
	int i=10;
}
public class PassingObjectByReference {

	
	public static void main(String[] args) {
		PassingObjectByReference obj=new PassingObjectByReference();
		obj.method2();
	}
	
	public void method2() {
		Test t1=new Test();
		System.out.println("Original value of i "+t1.i);
		t1.i=50;
		System.out.println("Before method3 i = "+t1.i);
		method3(t1);
		System.out.println("After method3 i = "+t1.i);
	}
	
	public void method3(Test t) {
		t.i=30;
		System.out.println("In method3 i = "+t.i);
	}

}
