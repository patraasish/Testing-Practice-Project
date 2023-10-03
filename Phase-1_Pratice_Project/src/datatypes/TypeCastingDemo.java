package datatypes;

//Write a program in Java to perform implicit and explicit type casting
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//implicit type casting
		int num1=19;
		float num2=num1;
		double num3=num2;
		
		System.out.println("Implicit type casting");
		System.out.println("Integer value: "+num1);
		System.out.println("Float value: "+num2);
		System.out.println("Double value: "+num3);
		
		
		//Explicit type casting
		double num4=34.9;
		float num5=(float)num4;
		int num6=(int)num5;
		
		System.out.println("Explicit type casting");
		System.out.println("Double value: "+num4);
		System.out.println("Float value: "+num5);
		System.out.println("Integer value: "+num6);
	}

}
