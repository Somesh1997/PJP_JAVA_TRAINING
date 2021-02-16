import java.util.*;
class List3
{
	static ArrayList<String> list =new ArrayList<String>();

	public static void printAll()
	{
		try
		{
for(ListIterator itr=list.listIterator();itr.hasNext();)
{
	String p=(String)(itr.next());
	System.out.println(p);
}
}
catch(Exception e)
{
	System.out.println("List is Empty Firstly Add Element in the List : ");
}

	}
	public static void main(String[] args) {
          boolean m=true;
          while(m){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valid choice : ");
		System.out.println("1. Adding String Elemnets in ArrayList : ");
		System.out.println("2. Printing The information about ArrayList : ");
		System.out.println("3. For Exiting : ");
		try{
         int a=sc.nextInt();
         if(a == 1)
         {
         	System.out.println("Please Enter a String : ");

         	String p=sc.next();
         	list.add(p);
         	m=true;
         	continue;
         }
         if(a==2)
         {
         	printAll();
         	m=true;
         }
         else
         {
         	System.out.println("Thank you for using : ");
         	m=false;
         	System.exit(0);
         }

        }
        
       catch(Exception e)
       {
       	System.out.println("Please Enter Valid Input : ");

       }
    }

	}
}