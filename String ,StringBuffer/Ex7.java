import java.util.Scanner;
public class Ex7
{
   public static void main(String str[])
   {
      String s1;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String : ");
      s1 = sc.next();
      StringBuffer sb1 = new StringBuffer(s1);
      int n =sb1.length();
      String s2=sb1.substring(0,1);
      String s3=sb1.substring(n-1,n);
      if(s2.equals("x"))
      {
         sb1.delete(0,1);
         if(s3.equals("x"))
         {
            sb1.delete(n-2,n-1);
         }
      }
      
      System.out.println(sb1);
  }
}