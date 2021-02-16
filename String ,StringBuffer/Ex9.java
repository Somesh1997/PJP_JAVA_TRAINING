import java.util.Scanner;
public class Ex9
{
   public static void main(String str[])
   {
      String s1,s2,s=" ";
      char c;
      int min=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first String : ");
      s1 = sc.next();
      StringBuffer sb1 = new StringBuffer();
      System.out.print("Enter second string");
      s2=sc.next();
      StringBuffer sb2 =new StringBuffer();
      int n1 =s1.length();
      int n2=s2.length();
      if(n1<n2)
      {
         min=n1;
         for(int j=0;j<n1;j++)
        {
         c=s1.charAt(j);
         sb1.append(c);
         c=s2.charAt(j);
         sb1.append(c);
        }
      }
      if(n2<n1)
      {
         min=n2;
         for(int j=0;j<n2;j++)
         {
         c=s1.charAt(j);
         sb1.append(c);
         c=s2.charAt(j);
         sb1.append(c);
         }
      }
      if(n1==n2)
      {
         for(int j=0;j<n1;j++)
      {
         c=s1.charAt(j);
         sb1.append(c);
         c=s2.charAt(j);
         sb1.append(c);
      }
      }
      
      if(min==n2)
       s=s1.substring(min,n1);
      if(min==n1)
       s = s2.substring(min,n2);   
      sb1.append(s);
      System.out.println(sb1);
  }
}