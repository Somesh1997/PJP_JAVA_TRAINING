import java.util.Scanner;
public class Ex3
{
   public static void main(String str[])
   {
      String s1, s2;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String : ");
      s1 = sc.next();
      StringBuffer sb1 = new StringBuffer(s1);
      s2=sb1.substring(0,2);
      int n =sb1.length();
      for(int i=0;i<n;i++)
      {
      	System.out.print(s2);
      }
  }
}