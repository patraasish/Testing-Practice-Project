package javaprograms;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("I am non parameterized Constructor");
	}
	
	ConstructorDemo(boolean a){
		System.out.println("I am  parameterized Constructor "+a);
	}
	
	ConstructorDemo(int a,String str){
		System.out.println("I am  parameterized Constructor"+a+str);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo constructorDemo=new ConstructorDemo();
		ConstructorDemo constructorDemo1=new ConstructorDemo(true);
		ConstructorDemo constructorDemo2=new ConstructorDemo(2," hello ");
		
	}

}
