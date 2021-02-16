import java.util.Scanner;
class Palindrome
{
	public static void main(String str[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.next();
        String b = "";
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}