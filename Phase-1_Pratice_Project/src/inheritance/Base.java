package inheritance;

public class Base {

	public static void openbrowser(String browser) {
		System.out.println("Open the browser"+browser);
	}
	
	public static void login(String username,String password) {
		System.out.println("Enter Username: "+username);
		System.out.println("Enter Password: "+password);
		System.out.println("Sign into mailbox");
	}
	public static void logout() {
		System.out.println("click on logout button");	
	}
	public static void main(String[] args) {
	

	}

}
