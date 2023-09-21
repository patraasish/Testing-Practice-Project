package com.mypratice;


abstract class Shape {
	abstract void draw();
	public void draw2() {
		System.out.println("hii");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Shape implemented");
	}
	
	public void rectangle() {
		System.out.println("Rectangle");
	}
}
public class AbstractClassExample extends Shape {
		void draw() {
		System.out.println("draw");
	}
	public static void main(String args[]) {
		
		AbstractClassExample obj = new AbstractClassExample();
		obj.draw2();
		Shape s=new Rectangle();
		//its give an error
		//s.rectangle();
		s.draw();
	}
	
}
