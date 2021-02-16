import java.util.*;
public class StringOperations
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
         while(true)
         {
         	try{
         	System.out.println("1. Insert");
         	System.out.println("2. Search");
         	System.out.println("3. Delete");
         	System.out.println("4. Display");
         	System.out.println("5. Exit");
         	System.out.println("Enter your choice : ");
         	int hy=sc.nextInt();
         	if(hy==1)
         	{
                 System.out.println("Enter the item to be inserted: ");
                 String p=sc.next();
                 list.add(p);
                 System.out.println("Inserted Successfully ");
                 continue;

         	}
         	if(hy==2)
         	{
         		System.out.println("Enter the item to search");
         		String nh=sc.next();
         		int f=0;
         		try
         		{
         			for(Iterator<String> it=list.iterator();it.hasNext();)
         			{
         				String p1=(String)it.next();
         				if(p1.equals(nh))
         				{
         					System.out.println("item found in the list ");
         					f=1;
         					break;
         				}
         			}
         		}
         		catch(Exception e)
         		{

         		}
         		if(f==0)
         		{
                   System.out.println("item not found in the list ");
         		}
         		continue;
         	}
         	if(hy==3)
         	{
                  System.out.println("Enter the item to delete ");
                  String q=sc.next();
                  int i=0;
                  try{
                  for (Iterator<String> it = list.iterator(); it.hasNext(); )
	 	       	 {
                   

                  String p=(String)it.next();
                   if(p.equals(q))
                   {
                   	it.remove();
                   	System.out.println("Deleted Successfully");
                   	i=1;
                   	break;
            //       	hj=true;
                   }
                 }
             }
                  catch(Exception e){
                  	System.out.println("Item does not exist ");
                  }
                  if(i==0)
                  {
                  	System.out.println("Item does not exist ");
                  }
                  continue;
         	}
         	if(hy==4)
         	{
         		int i=0;
         		  try{
         		  	System.out.println("The items in the list are ");
                  for (Iterator<String> it = list.iterator(); it.hasNext(); )
	 	       	 {
                   
 
                  String p=(String)it.next();
                   System.out.println(p);
                   i=1;
                 }
             }

                  catch(Exception e){
                  	System.out.println("list is empty : ");
                  }
                   if(i==0)
             {
             	System.out.println("list is empty : ");
             }
                  continue;
         	}
         	if(hy==5)
         	{
         		System.exit(0);
         	}

         }
         catch(Exception e)
         {
         	System.out.println("Please enter valid Input Thank You :");
         	System.exit(0);
         }
     }


	}
}