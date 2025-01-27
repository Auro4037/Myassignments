package week1.day4;

public class ReverseOddWords {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  String test="I am a software tester";
  String[] str=test.split(" ");
  for(int i=0;i<str.length;i++)
  {
   if(i==0) 
    System.out.print(str[0]);
   else if(i%2==0)
    System.out.print(str[i]);
   else if(i%2==1)
   {
    char[] odd=str[i].toCharArray();
    for(int j=(odd.length)-1;j>=0;j--)
    {
     System.out.print(odd[j]);
    }
   }
   System.out.print(" ");
  }
 }
}
