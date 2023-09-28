package inheritance;

public class Payments extends HomePage {
	
	
//Example of multilevel inheritance
	public void payments() {
		System.out.println("Test Payments Page");
	}
	
	public static void main(String[] args) {
	
		Payments payments=new Payments();
		payments.openbrowser("Chrome");
		payments.login("admin", "admin");
		payments.Homepagetest();
		payments.payments();
		payments.logout();
		

	}

}
