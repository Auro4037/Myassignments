package week2.day4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> company = new ArrayList<String>();
		company.add("HCL");
		company.add("WIPRO");
		company.add("ASPIRE SYSTEMS");
		company.add("CTS");
		Collections.sort(company);
		System.out.println(company);
		
		int size= company.size();
		List<String> Reversecompany = new ArrayList<String>();
		for (int i=size-1;i>=0;i--) {
			String ReversedArray = company.get(i);
			Reversecompany.add(ReversedArray);
			
		}
		System.out.println("The reversed array list is " +Reversecompany);
		
		
		

	}

}
