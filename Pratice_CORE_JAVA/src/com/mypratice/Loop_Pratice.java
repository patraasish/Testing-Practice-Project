package com.mypratice;

public class Loop_Pratice {

	public static void main(String args[]) {
		
		int arr[]={1,3,5,4};
		
		//while loop
		int i=1;
		while(i<3) {
			System.out.println("I am in While loop");
			i++;
		}
		i=1;
		
		//do while loop
		do {
			System.out.println("I am in do while loop");
			
		}while(i>2);
		
		//for loop
		for(int j=0;j<2;j++) {
			System.out.println("I am in for loop");
		}
		
		//for each loop
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}
	
}
