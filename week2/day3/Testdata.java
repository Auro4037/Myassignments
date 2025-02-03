package week2.day3;

public class Testdata {
	
	public void enterCredentials() {
		System.out.println("Enter the creds");
	}
	
	public void navigateToHomePage() {
		System.out.println("Homepage");
	}
	 public static void main(String[] args) {
		Testdata td= new Testdata();
		td.enterCredentials();
		td.navigateToHomePage();
	}
}
