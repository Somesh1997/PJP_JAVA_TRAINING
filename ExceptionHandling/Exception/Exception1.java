public class Exception1
{
	public static void main(String[] args) {
		try{
                 int a=Integer.parseInt(args[0]);
                  int s=Math.multiplyExact(a,a);
                  System.out.println("The square value is "+s);
                  System.out.println("The work has been done successfully");
            }
            catch(Exception e)
            {
            	//e.printStackTrace(); 
            	System.out.println(e.getClass());
            	System.out.println("Entered input is not a valid format for an integer.");
            }




	}
}