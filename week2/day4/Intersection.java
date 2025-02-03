package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1= Arrays.asList(3,2,11,4,6,7);
		System.out.println(list1);
		int lengthoflist1=list1.size();
		

		List<Integer> list2= Arrays.asList(1,2,8,4,9,7);
		System.out.println(list2);
		int lengthoflist2=list2.size();
		
		for(int i=0;i<lengthoflist1;i++) {
			for(int j=0;j<lengthoflist2;j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println("Both lists common values are list1" + list1.get(i)+" and List2: "+ list2.get(j)+ "are equal");
				}
			}
		}
		
		
		
		
		}

	}


