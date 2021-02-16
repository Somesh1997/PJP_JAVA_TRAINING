import java.util.Scanner;
public class Ex5
{
   public static void main(String str[])
   {
      String s1;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String : ");
      s1 = sc.next();
      StringBuffer sb1 = new StringBuffer(s1);
      StringBuffer sb2 = new StringBuffer();
      int n =sb1.length();
      sb2=sb1.delete(0,1);
      sb2=sb2.delete(n-2,n-1);
      System.out.println(sb2);
  }
}