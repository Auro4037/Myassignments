package week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numlist= Arrays.asList(3,2,11,4,6,7);
		Collections.sort(numlist);
		System.out.println(numlist);
		int listsize=numlist.size();
		System.out.println("The 2nd largest number is " +numlist.get(listsize-2));
	}

}
