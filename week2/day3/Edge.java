package week2.day3;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Snap taken in edge");
		
	}
	
	public void clearCookies() {
		System.out.println("Cookies Cleared");
		
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stu
		Edge e= new Edge();
		e.clearCookies();
		e.navigateBack();
	}

}
