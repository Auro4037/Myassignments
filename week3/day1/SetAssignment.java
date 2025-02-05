package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyname= "google";
		char[] s1= companyname.toCharArray();
		System.out.println(s1);
		
		Set<Character> word= new LinkedHashSet<Character>();
		for(int i=0;i<s1.length;i++) {
			word.add(s1[i]);
			
		}
		System.out.println("The new set :"+word);

	}

}
