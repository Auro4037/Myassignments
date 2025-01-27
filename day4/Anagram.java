package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1="stops";
		String text2="potss";
		
		if(text1.length()==text2.length()) {
			
			char[] charArray1 =text1.toCharArray();
			char[] chaArray2 =text2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(chaArray2);
			
			boolean res = Arrays.equals(charArray1, chaArray2);
			if(res) {
				System.out.println(text1 + " and " + text2 + " are anagaram");;
			}
			else {
				System.out.println(text1 + "and " + text2 + "aren't anagaram");;
			}
		}
		

	}

}
