package exceptionpratices;

public class FinallyDemo {

	public static void main(String[] args) {
	
		int i=9;
		int j=0;
		
		try {
			System.out.println("Division "+(i/j));
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}

		finally {
		System.out.println("addition "+(i+j));
		System.out.println("multiplication "+i*j);
		System.out.println("substaction "+(i-j));
		}
	}
}
