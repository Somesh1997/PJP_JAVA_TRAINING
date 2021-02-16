import java.util.Scanner;
public class Ex6
{
   public static void main(String str[])
   {
      String a,b,small,big;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first String : ");
      a = sc.next();
      System.out.print("Enter second String : ");
      b= sc.next();
      int n1 = a.length();
      int n2 = b.length();
      StringBuffer sb1 ;
      StringBuffer sb2 ;
      if(n1>n2)
      {
         sb1=new StringBuffer(a);
         sb2=new StringBuffer(b);
         small=b;
         big=a;
      }
      else
      {
         sb1=new StringBuffer(b);
         sb2=new StringBuffer(a); 
         small=a;
         big=b;
      }
      sb2.append(big);
      sb2.append(small);
      
      System.out.println(sb2);
  }
}