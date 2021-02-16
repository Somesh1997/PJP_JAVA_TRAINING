import java.util.*;
class Map4
{
	public static void main(String[] args) {
		 HashMap<String,Integer> ContactList=new HashMap<>();
		 System.out.println("Enter the total number of contacts ");
         Scanner sc=new Scanner(System.in);
		 int total=sc.nextInt();
		 while(total!=0)
		 {
		 	System.out.println("Enter the name of contact  ");
		 	String p=sc.next();
		 	System.out.println("Enter the Phone number ");
		 	int num=sc.nextInt();
		 	ContactList.put(p,num);
		 	total--;

		 }
		 System.out.println(ContactList);
		 System.out.println("Enter the name of Key That Exists or not ");
		 String key=sc.next();
		 Set s1=ContactList.entrySet();
		 Iterator it=s1.iterator();
		 boolean s=false;
		 try{
		 while(it.hasNext())
		 {
		 	Map.Entry m1=(Map.Entry)it.next();
		 	if(m1.getKey().equals(key))
		 	{
		 		s=true;
		 		System.out.println("Key is Existed ");
		 		break;
		 	}
		 }
		}
		catch(Exception e)
		{
			System.out.println("Key is not Existed ");
		}
		if(s==false)
		{
			System.out.println("Key is not Existed ");
		}
		System.out.println("Enter the name of Value That Exists or not ");
		 int value=sc.nextInt();
		 Iterator it1=s1.iterator();
		 boolean p=false;
		 while(it1.hasNext())
		 {
           Map.Entry m1=(Map.Entry)it1.next();
           //System.out.println(m1.getValue());
           if(m1.getValue().equals(value))
           {
           	System.out.println("value is Existed : ");
           	p=true;
           	break;
           }
		 }
		 if(p==false)
		 {
		 	System.out.println("Value is not Existed ");
		 }
		 Iterator it2=s1.iterator();
		 while(it2.hasNext())
		 {
		 	Map.Entry m2=(Map.Entry)it2.next();
		 	System.out.println(m2.getKey()+"   "+m2.getValue());
		 }






	}
}