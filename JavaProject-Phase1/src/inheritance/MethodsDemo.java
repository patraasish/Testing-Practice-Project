package inheritance;

public class MethodsDemo {

	//method which do not return value
	public void login() {
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail() {
		System.out.println("Composing an email");
	}
	
	public void logout() {
		System.out.println("click on logout button");	
	}
	
	public static void main(String[] args) {
		MethodsDemo obj=new MethodsDemo();
		obj.login();
		obj.ComposeEmail();
		obj.logout();
	}

}
