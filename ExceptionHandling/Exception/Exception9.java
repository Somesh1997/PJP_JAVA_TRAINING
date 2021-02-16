class Exception9
{
	public static void main(String[] args) {
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("The quotient of "+a+"/"+b+" = "+c);
		}
		catch(Exception e)
		{
			System.out.println("DivideByZeroException caught");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}