package week2.day3;

public class LoginTestData extends Testdata {
	
	public String enterUsername(String user) {
		return user;
		
	}
	
	public String enterPassword(String pass) {
		return pass;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData ltd= new LoginTestData();
		ltd.enterCredentials();
		System.out.println(ltd.enterUsername("Auro"));
		System.out.println(ltd.enterPassword("Sdfre"));
		ltd.navigateToHomePage();
		

	}

}
