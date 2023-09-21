package inheritance;

public class HomePage extends Base{

	public void Homepagetest() {
		System.out.println("Test for Home Page");
	}
	
	public static void main(String[] args) {
		
		HomePage homePage=new HomePage();
		homePage.openbrowser("Chrome");
		homePage.login("admin","admin");
		homePage.Homepagetest();
		homePage.logout();

	}

}
