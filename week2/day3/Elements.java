package week2.day3;

public class Elements extends Button{
	
	public static void main(String[] args) {
		Webelement we = new Webelement();
		we.click();
		System.out.println(we.setText("Elements class executing"));
	}
}
