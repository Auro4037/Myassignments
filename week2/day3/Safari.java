package week2.day3;

public class Safari extends Browser{
	
	public void readerMode() {
		System.out.println("In Safari Reader Mode");
	}
	
	public void fullscreenMode() {
		System.out.println("In Safari Fullscreen Mode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari s= new Safari();
		s.openURL();
		s.fullscreenMode();
		s.closeBrowser();
		

	}

}
