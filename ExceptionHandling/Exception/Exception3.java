import java.util.Scanner;
public class Exception3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		try
		   {
		   int size=sc.nextInt();
		   int a[]=new int[size];
                    System.out.println("Enter the elements in the array");
		   for(int i=0;i<size;i++)
		     {
               a[i]=sc.nextInt();
		     }
		     System.out.println("Enter the index of the array element you want to access");
		     int m=sc.nextInt();
		     System.out.println("The array element at index "+m+" = "+a[m]);
	       }
	    catch(Exception e)
	    {
	    	System.out.println(e.getClass());
	    }
	}
}