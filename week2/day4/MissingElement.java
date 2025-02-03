package week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,10,6,8);
		Collections.sort(list);
		System.out.println(list);
		
		
		int listsize=list.size();
		
		for(int i=0;i<listsize-1;i++) {
			int currentelement=list.get(i);
			int nextelelment=list.get(i+1);
			if(currentelement+1 !=nextelelment) {
				System.out.println("The missing elements are " +(currentelement+1));
			}
		}

	}

}
