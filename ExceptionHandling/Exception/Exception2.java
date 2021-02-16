import java.util.Scanner;
public class Exception2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int b=sc.nextInt();
		try
		{
			int m=a[b];
			System.out.println("The array element at index "+b+" = "+m);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}
}