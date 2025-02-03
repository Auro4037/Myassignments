package week2.day3;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Incognito Mode Opened in chrome");
	}
	
	public void clearCache() {
		System.out.println("Cache cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome ch= new Chrome();
		ch.openURL();
		ch.clearCache();
		

	}

}
