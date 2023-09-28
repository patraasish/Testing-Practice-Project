package exceptionpratices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();

		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		int result=num1/num2;
		System.out.println("result"+result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		catch(InputMismatchException e) {
			System.out.println("please enter integer ");
		}
		catch(Exception e) {
			System.out.println("please enter valid input");
		}
		sc.close();
		
	}

}
