import java.util.Scanner;
public class Concatenation
{
   public static void main(String str[])
   {
      String s1, s2;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter First String : ");
      s1 = sc.next();
      System.out.print("Enter Second String : ");
      s2 = sc.next();
      StringBuffer sb1 = new StringBuffer(s1);
      StringBuffer sb2 = new StringBuffer(s2);
      int n1=sb1.length();
      int n2=sb2.length();
      String s3=sb1.substring(n1-1,n1);
      String s4=sb2.substring(0,1);
      if(s3.equalsIgnoreCase(s4))
      {
         sb1=sb1.delete(n1-1,n1);
         System.out.print("Concatenating String 2 into String 1...\n");
         sb1.append(sb2);
         String str1=sb1.toString();
         str1=str1.toLowerCase();
         System.out.println("String 1 after Concatenation is " +str1);
      }
      else
      {
         sb1=sb1.append(" ");
         sb1=sb1.append(sb2);
         System.out.print("Concatenating String 2 into String 1...\n");
         String str1=sb1.toString();
         str1=str1.toLowerCase();
         System.out.println("String 1 after Concatenation is " +str1);
      }
      
   }
}