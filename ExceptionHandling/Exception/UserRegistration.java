class InvalidCountryException extends Exception
{
InvalidCountryException(String country)
{
super(country);

}
}
public class UserRegistration
{
	public void registerUser(String username,String userCountry)throws InvalidCountryException
	{
		try{
if(userCountry.equals("India"))
{
	System.out.println("User registration done successfully");
}
else
{
throw new InvalidCountryException("User Outside India  cannot be registered");
}
}
catch(InvalidCountryException e)
{
	System.out.println("InvalidCountryException should be thrown");
}
	}
	public static void main(String[] args) {
		try
		{
			String s=args[0];
			String s1=args[1];
		}
		catch(NumberFormatException e)
		{
			System.out.println("please enter valid student name and valid country name : ");
		}
	}
}