import java.util.*;
class Set3
{
	public static void main(String[] args) {
		ArrayList<String> bg=new ArrayList<String>();
		TreeSet<String> h=new TreeSet<String>();
		
		Scanner sc=new Scanner(System.in);
		boolean s=true;
		while(s){
			try{
        System.out.println("1. Adding String Object in to collections : ");
        System.out.println("2. Reverse the elements of the Collection : ");
        System.out.println("3. Iterate the elements of the TreeSet using Iterator : ");
        System.out.println("4. Check if a particular element exists or not : ");
        System.out.println("5. for Exiting :");
       int x=sc.nextInt();
       if(x==1)
       {
       	System.out.println("Enter the String : ");
       	String l=sc.next();
       	h.add(l);
       	continue;
       }
       if(x==2)
       {
         try{
         	
         	
         	bg.addAll(h);
         	 Collections.reverse(bg);
         	 h.clear();
         	 h.addAll(bg);

         	 System.out.println(h);

         }
         catch(Exception e)
         {
         	System.out.println("Element not found : ");
         }
         continue;
       }
       if(x==3)
       {
       	 for (Iterator<String> it1 = h.iterator(); it1.hasNext(); )
	 	       	 {
                  try{
                    String k=(String)(it1.next());
                    System.out.println(k);
                   
                }
                catch(Exception e)
                {
                     
                }
                  
                 }
                 continue;
       }
       if(x==4)
       {
       	System.out.println("Enter the Element that do you want to be searched : ");
       	String input=sc.next();
       	int df=0;
       	 for (Iterator<String> it1 = h.iterator(); it1.hasNext(); )
	 	       	 {
                  try{
                    String k=(String)(it1.next());
                    if(k.equals(input))
                    {
                          df=1;
                          break;
                    }
                   
                }
                catch(Exception e)
                {
                     
                }

                  
                 }
                 if(df==1)
                 {
                 	System.out.println(input +" is Existed : ");
                 }
                 else
                 {
                 	System.out.println(input +" is not Existed : ");
                 }
          continue;
       }
       if(x==5)
       {
       	System.out.println("Thank you for using This Application : ");
       	System.exit(0);
       }
        


        }
        catch(Exception e)
        {
        	System.out.println("Please Enter Valid Input : ");
          	System.exit(0);

        }
      }
	}
}