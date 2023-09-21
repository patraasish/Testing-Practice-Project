package com.mypratice;

import java.util.Scanner;

public class DeleteArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;int location=0;
		
		System.out.println("Enter the no of elements array ");
		int arrayLength=sc.nextInt();
		
		int array[]=new int[arrayLength];
		
		System.out.println("Enter array elements one by one");
		for(int i=0; i<arrayLength ;i++ ) {
			array[i]=sc.nextInt();
		}

		System.out.println("Original Array : ");
		for(int a:array) {
			System.out.print(a+" ");
			}
		
		System.out.println("\nEnter the element you want to delete");
		int deleteElement=sc.nextInt();
		
		for(int i=0;i<arrayLength;i++) {
			
			if (array[i]==deleteElement) {
				flag=1;
				location=i;
				break;
			}
			
			else {
				flag=0;
			}
		}
		
		if(flag==1) {
			for(int j=location+1;j<arrayLength;j++) {
				array[j-1]=array[j];
			}
			
			System.out.println("After deleting");
			for(int i=0;i<=arrayLength-2;i++) {
				System.out.println(array[i]+" ");
			}
			
		}
		
		else {
			System.out.println("Element not found");
		}
		
		sc.close();
	}

}
