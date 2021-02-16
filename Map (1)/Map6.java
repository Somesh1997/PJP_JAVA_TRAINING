import java.util.*;
public class Map6
{
    String CountryName;
    String capital;
        public Map6(String CountryName,String capital)
             {
             	this.CountryName=CountryName;
                this.capital=capital;
             }


	   static Hashtable<String,String> M1=new Hashtable<String,String>();
       public static Hashtable<String,String> saveCountryCapital(String CountryName, String capital)
       {
                  M1.put(CountryName,capital);
                  return M1;
       }
       static Set s3=M1.keySet();
       static Collection c=M1.values();
       static Set s2=M1.entrySet();
       public static String getCapital(String CountryName)
       {
       	           String po="";
                   Iterator itr=s2.iterator();
                   while(itr.hasNext())
                   {
                   	Map.Entry m1=(Map.Entry)itr.next();
                   	if(m1.getKey().equals(CountryName))
                   	{
                          po=po+m1.getValue();
                   	}
                   }
                   return po;
       }
       public static String getCountry(String capitalName)
       {
                   String po="";
                   Iterator itr=s2.iterator();
                   while(itr.hasNext())
                   {
                   	Map.Entry m1=(Map.Entry)itr.next();
                   	if(m1.getValue().equals(capitalName))
                   	  {
                          po=po+m1.getKey();
                   	  }
                   }
                   return po;
       }
       public static Hashtable<String,String> another()
       {            Hashtable<String,String> M2=new Hashtable<String,String>();
                    Iterator itr=s2.iterator();
                   while(itr.hasNext())
                   {
                   	Map.Entry m1=(Map.Entry)itr.next();
                   	M2.put((String)m1.getValue(),(String)m1.getKey());
                   
                   }
                   return M2;
       }
       public static ArrayList<String> countryname()
       {
               ArrayList<String> list=new ArrayList<String>();
               Iterator itr=s2.iterator();
               while(itr.hasNext())
               {
               	Map.Entry m1=(Map.Entry)itr.next();
               	list.add((String)m1.getValue());
               }
               return list;
       }



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		          	System.out.println("Enter the Number of Objects ");
		            int obj=sc.nextInt();
              
              for(int i=0;i<obj;i++)
              {
	              	System.out.println("Enter the name of Country ");
	                
	              	String con=sc.next();
	              		
	              	System.out.println("Enter the name of capital ");
	              	 
	              	String cap=sc.next();
	              
	              	Map5 sp=new Map5(con,cap);
	              	saveCountryCapital(con,cap);
              }
              System.out.println("       ***********************************************************     ");
	              System.out.println("enter the name of Country ");
	              String kl=sc.next();
                String getc=getCapital(kl);
                if(getc.equals(""))
                  System.out.println("No capital is found ");
                else
	              System.out.println(kl +"  capital is   "+getc);
                System.out.println("       ***********************************************************     ");
	              System.out.println("enter the name of Capital ");
	              String cl=sc.next();
                String pl=getCountry(cl);
                if(pl.equals(""))
                {
                     System.out.println("No country is found ");
                }
                else
	              System.out.println(cl+"   country is  "+pl);
	              System.out.println(another()); 
	              System.out.println(countryname());
		}
		catch(Exception e)
		{
			System.out.println("Enter the Integer value");
		}
	}
}