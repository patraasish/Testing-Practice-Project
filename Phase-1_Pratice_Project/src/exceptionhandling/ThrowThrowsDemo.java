package exceptionhandling;

//Writing code for throw and throws keyword
public class ThrowThrowsDemo {
	
	public void method(int age) throws Exception {
		if(age<18) {
		throw new Exception("You are not valid for voting");
		}
		
		else
		{
			System.out.println("Welcome! you are elidgble for voting");
		}
	}
	
	public static void main(String[] args) {
		
		ThrowThrowsDemo obj=new ThrowThrowsDemo();
		try {
		obj.method(17);
		//obj.method(20);
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
