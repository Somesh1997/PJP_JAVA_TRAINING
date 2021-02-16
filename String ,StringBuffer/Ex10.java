import java.util.Scanner;
public class Ex10
{
   public static void main(String str[])
   {
      String s1,s2;
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String : ");
      s1 = sc.next();
      System.out.println("enter the integer:");
      n=sc.nextInt();
      int n1 =s1.length();
      s2=s1.substring(n1-3,n1);
      for(int i=0;i<n;i++)
      {
         System.out.print(s2);
      }
   }
}