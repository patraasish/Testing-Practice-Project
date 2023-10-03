package exceptionhandling;

public class MultipleCatchBlockDemo {

	    public static void main(String[] args) {
	    	
	    	int arr[]= {4,5,6};
	        try {
	            System.out.println(arr[3]);
	            int num=5/0;
	            
	           
	        } catch (ArithmeticException e)
	        {
	        	System.err.println("ArithmeticException: " + e.getMessage());
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } 
	        
	    }

	}


