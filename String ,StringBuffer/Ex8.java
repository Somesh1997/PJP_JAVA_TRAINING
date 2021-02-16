import java.util.Scanner;
public class Ex8
{
   public static void main(String str[])
   {
      String s1,s2;
     
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String : ");
      s1 = sc.next();
      StringBuffer sb1 = new StringBuffer(s1);
      int n =sb1.length();
      int i=sb1.indexOf("*");
      sb1.delete(i-1,i+2);
      System.out.println(sb1);
  }
}