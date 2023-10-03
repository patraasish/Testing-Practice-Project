package exceptionpratices;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		int i=9;
		int j=0;
		
		try {
			System.out.println("Division "+(i/j));
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}

		System.out.println("addition "+(i+j));
		System.out.println("multiplication "+i*j);
		System.out.println("substaction "+(i-j));
	}

}
