//import Exce.*;
class InvaliedAgeException extends Exception
{
	InvaliedAgeException(String str)
	{
		super(str);
		System.out.println(str);
		

	}
	
}
public class Exception8
{
      public static void validate(int age,String s) throws InvaliedAgeException
      {
        try{
      	if(age>=18 && age<=60)
      	{
      		System.out.println("Eligible : ");
      		System.out.println("name is "+s+"\nage is "+age);
      	}

      	else
      	{
      		
      		
            String p="not eligible : ";
      		throw new InvaliedAgeException(p);
      	}
      }
      catch(Exception e){
      	
      }
      
     
      }


	public static void main(String[] args) {
		try
		{
			String s=args[0];
			int age=Integer.parseInt(args[1]);
			validate(age,s);
			//System.out.println("name is = "+s+" \n and age is = "+age);
		}
		catch(Exception e)
		{
			System.out.println("Age should be in Integer");
		}
	}
}