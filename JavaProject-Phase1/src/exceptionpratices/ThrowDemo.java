package exceptionpratices;

public class ThrowDemo {

	
	public void div(int a,int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("Integer can not divided by Zero");
		}
		
		else
		{
			int c=a/b;
			System.out.println("result"+c);
		}
		
	}
	public static void main(String[] args) {
		ThrowDemo throwDemo=new ThrowDemo();
		try {
			throwDemo.div(2, 0);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
