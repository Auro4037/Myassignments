package week1.day4;

public class ChangeOddtoUpperCase {
	public static void main(String[] args) {
		
		  String test="changeme";
		  char[] ch = test.toCharArray();
		  int lengthofarray = ch.length;
		  for (int i=0;i<=lengthofarray-1;i++)
		  {
		  
		   if (i%2!=0)
		   {    
		     ch[i]=Character.toUpperCase(ch[i]);
		   }
		  }

		   System.out.println(new String(ch));
		   
		  }
		   
		 }
