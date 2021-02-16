import java.util.*;
class Set4
{
	
	static TreeSet<String> set=new TreeSet<String>();
	public static TreeSet saveCountryNames(String CountryName)
	{
       // System.out.println(set.add(CountryName));
        if(set.add(CountryName))
        {
        	System.out.print("Adding Succesfully :");
        }
        else
        {
        	System.out.print(" Item already Present Here : ");
        }
        return set;

	}
public static String getCountry(String CountryName)
{
   for (Iterator<String> it1 = set.iterator(); it1.hasNext(); )
	 	       	 {
                  try{
                    String k=(it1.next());
                    if(k.equals(CountryName))
                    {
                    	return(CountryName);
                    }
                }
                catch(Exception e)
                {

                }
                  
                 }
                 return(null);
}
	public static void main(String[] args) {
		Set1 scv=new Set1();
		Scanner sc=new Scanner(System.in);
		boolean s=true;
		while(s)
		{   System.out.println("Press Valid Input : ");
			System.out.println("1.Adding Elements in to Set : ");
			System.out.println("2.Retriving Element from Set : ");
			System.out.println("Press Any key For Exiting : ");
try{
          int m=sc.nextInt();
            if(m==1){
            	System.out.println("Enter the String : ");
              String p=sc.next();
		     System.out.println("  "+saveCountryNames(p));
		     continue;
		 }
		      if(m==2)
		      {

		      	System.out.println("enter the String ");
		      	String l=sc.next(); 
	     	 System.out.println(getCountry(l));
	     	 continue;
	     	}
	     	else{
		System.out.println(set);
		System.exit(0);
	}
		
		}
		catch(Exception e)
		{
			System.out.println("Thank you for using this appliction Enter Valid Input : ");
			System.exit(0);
		
		}
	}
}
	}