package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={1, 4,3,2,8, 6, 7};
		Arrays.sort(array);
		
		for (int i=0;i<array.length;i++) {
			if (array[i]!=i+1) {
				int missingelement=i+1;
				System.out.println("The missing element is : " + missingelement);
				break;
			}
		}

	}

}
