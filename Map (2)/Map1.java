import java.util.*;
public class Map1
{
    String CountryName;
    String capital;
        public Map1(String CountryName,String capital)
             {
             	this.CountryName=CountryName;
                this.capital=capital;
             }


	   static HashMap<String,String> M1=new HashMap<String,String>();
       public static HashMap<String,String> saveCountryCapital(String CountryName, String capital)
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
       public static HashMap<String,String> another()
       {            HashMap<String,String> M2=new HashMap<String,String>();
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
              
              	Map1 sp=new Map1(con,cap);
              	saveCountryCapital(con,cap);
              }
              System.out.println("enter the name of Country ");
              String kl=sc.next();
              System.out.println(kl +"  capital is   "+getCapital(kl));
              System.out.println("enter the name of Capital ");
              String cl=sc.next();
              System.out.println(cl+"   country is  "+getCountry(cl));

           System.out.println(another()); 
                System.out.println(countryname());
		}
		catch(Exception e)
		{
			System.out.println("Enter the Integer value");
		}
		

	}
}