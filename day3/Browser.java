package week1.day3;

public class Browser {
	
	public static String launchBrowser(String browserName){
	
		System.out.println("Browser launched succesfully");
		return browserName;
		
	}

	public static void loadURL() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser b =new Browser();
		System.out.println(b.launchBrowser("Chrome"));
		b.loadURL();
		

	}

}
