package exceptionhandling;

//Writing a program to perform try-catch block
public class TryCatchDemo {

	public static void main(String[] args) {
		
	     try  
	        {  
	        int num=10/0;    
	        }  
	            
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        
	    }  
	}


