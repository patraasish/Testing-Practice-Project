package javaprograms;

public class InbuiltMethods {

	public static void main(String[] args) {
		//Example of how to use inbuilt methods of string class
		
		String s1="Selenium";
		String s2=" Training";
		
		//concatinate both the strings and print it
		//using + operator
		String s3=s1+s2;
		
		//using concat() method
		String s4=s1.concat(s2);
		System.out.println(s1.concat(" training"));
		System.out.println("using + operator :"+s3);
		System.out.println("using concat method :" + s4);

	}

}
