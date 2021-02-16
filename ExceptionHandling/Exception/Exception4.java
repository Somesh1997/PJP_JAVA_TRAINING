public class Exception4
{
      public static int division(int a,int b) throws ArithmeticException
      {

      	int c=a/b;
      	return c;
      }


	
	public static void main(String[] args) {
          
          int a=Integer.parseInt(args[0]);
          int b=Integer.parseInt(args[1]);
         try{
           int p=division(a,b);		
           System.out.println(p);
           }
                      catch(ArithmeticException e)
                        {
                        	System.out.println("Denominator should not be Zero : ");
                        }


	}
}