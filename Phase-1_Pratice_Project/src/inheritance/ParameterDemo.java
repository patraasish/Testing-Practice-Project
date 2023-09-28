package inheritance;

public class ParameterDemo {
	public void login(String username,String password) {
		System.out.println("Enter Username: "+username);
		System.out.println("Enter Password: "+password);
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail(String text) {
		System.out.println("Composing an email: "+ text);
	}
	
	public void logout() {
		System.out.println("click on logout button");	
	}
	public static void main(String[] args) {
		ParameterDemo parameterDemo=new ParameterDemo();
		parameterDemo.login("Asish", "Patra@123");
		parameterDemo.ComposeEmail("Hello All");
		parameterDemo.logout();
		
	}

}
