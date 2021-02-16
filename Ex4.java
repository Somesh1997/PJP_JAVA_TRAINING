import java.util.Scanner;
public class Ex4
{
   public static void main(String str[])
   {
      String s1, s2;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String : ");
      s1 = sc.next();
      StringBuffer sb1 = new StringBuffer(s1);
      int n =sb1.length();
      if(n%2==0)
      {
         s2=sb1.substring(0,n/2);
         System.out.println(s2);
      }
      else
      {
         System.out.println("null");
      }
  }
}