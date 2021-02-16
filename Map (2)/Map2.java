import java.util.*;
public class Map2
{
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
	    Scanner sc=new Scanner(System.in);
	    try{
	    System.out.println("Enter the total number of Objects ");
	    int k=sc.nextInt();
	    for(int i=0;i<k;i++)
	    {
	    	try{
              System.out.println("Enter the Key ");
              int value=sc.nextInt();
              System.out.println("Enter the values ");
              String l=sc.next();
               h.put(value,l);
	    }
	    catch(Exception e)
	    {
              System.out.println("Enter the Integer value");
              System.exit(0);
	    }
	    }
	       System.out.println("    Value |    Key   ");
	    //System.out.println(h);
	     
	


	  
	    Set s=h.keySet();
	    Collection c=h.values();
	   
	    Set s1=h.entrySet();
	    Iterator itr=s1.iterator();

	    boolean sk=false;
	      Iterator itr3=s1.iterator();
	     while(itr3.hasNext())
	    {
	    	try{
	    	Map.Entry m1=(Map.Entry)itr3.next();
	    	System.out.println(m1.getValue() +"       "+m1.getKey());
	         }
	    catch(Exception e)
	    {

	    }
	}
	  System.out.println("Enter the name of Key ");

	    int p=sc.nextInt();
	    while(itr.hasNext())
	    {
	    	try{
	    	Map.Entry m1=(Map.Entry)itr.next();
	    	if(m1.getKey().equals(p))
	    	{ sk=true;
	    		System.out.println("Key is founded : ");
	    	}
	    }
	    catch(Exception e)
	    {

	    }
	    }
	    if(sk==false)
	    {
	    	System.out.println("Key is not found ");
	    }
	    boolean sm=true;
	    System.out.println("Enter the name of value ");
	    Iterator itr1=s1.iterator();

	    String v=sc.next();
       while(itr1.hasNext())
	    {
	    	try{
	    	Map.Entry m1=(Map.Entry)itr1.next();
	    	if(m1.getValue().equals(v))
	    	{ sm=true;
	    		System.out.println("Value is founded : ");
	    	}
	    }
	    catch(Exception e)
	    {

	    }
	    }
	    if(sm==false)
	    {
	    	System.out.println("Value is not found ");
	    }
	}
	catch(Exception e)
	{
		System.out.println("enter the Integer value ");
		System.exit(0);
	}
	  
	  //  boolean sk=false;
	 
	      //  Iterator itr3=s1.iterator();
	 
	    //System.out.println(h);

	}
}