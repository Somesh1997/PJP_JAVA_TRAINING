import java.util.Scanner;
public class Ex11
{
   public static void main(String str[])
   {
      String s1, s2;
      char c;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter First String : ");
      s1 = sc.next();
      System.out.print("Enter Second String : ");
      s2 = sc.next();
      StringBuffer sb1 = new StringBuffer(s1);
      StringBuffer sb2 = new StringBuffer(s2);
      StringBuffer sb3= new StringBuffer();
      int n1=sb1.length();
      int n2=sb2.length();

      int p=sb1.indexOf(s2);
      while(p!=-1)
      {
         if((p!=0)&&(p+n2)!=n1)
         {
            c=sb1.charAt(p-1);
            sb3.append(c);
            c=sb1.charAt(p+n2);
            sb3.append(c);
         }
         sb1.delete(p,p+n2);
         p=sb1.indexOf(s2);
      }
      System.out.println(sb3);  
   }
}