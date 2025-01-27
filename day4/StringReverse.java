package week1.day4;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="TestLeaf";
		char[] charArray = s.toCharArray();
		System.out.println(charArray);
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.println(charArray[i]);
		}
	}

}
