class InvalidCountryException extends Exception
{
InvalidCountryException(String country)
{
super(country);

System.out.println("InvalidCountryException should be thrown");

}
}
public class UserRegistration
{
	public static void registerUser(String username,String userCountry)throws InvalidCountryException
	{
		
if(userCountry.equalsIgnoreCase("India"))
{
	System.out.println("User registration done successfully");
}
else
{
throw new InvalidCountryException("User Outside India  cannot be registered");
}

	

	}
	public static void main(String[] args) {
		try
		{
			String s=args[0];
			String s1=args[1];
            registerUser(s,s1);
		}
		catch(NumberFormatException | InvalidCountryException e)
		{
			System.out.println("please enter valid student name and valid country name : ");
		}
	}
}