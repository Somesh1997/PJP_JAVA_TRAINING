import java.util.*;
class Employee
{
public String firstName;
public String lastName;
public String mobileNumber;
public String email;
public String address;
     Employee(String firstName,String lastName,String mobileNumber,String email,String address)
    {
	this.firstName=firstName;
	this.lastName=lastName;
	this.mobileNumber=mobileNumber;
	this.email=email;
	this.address=address;
    }
public void m()
{
   System.out.format("%-15s %-15s %-15s %-30s %-15s\n",firstName,lastName,mobileNumber,email,address);
}

}
class MyComprator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=((Employee)(obj1)).firstName;
		String s2=((Employee)(obj2)).firstName;
		return s1.compareTo(s2);



	}
}
public class TestEmployee
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         TreeSet<Employee> list = new TreeSet<Employee>(new MyComprator());
         Employee emp;
		   try
			  {
		            System.out.println("Enter the Number of Employees ");
		            int ecount=s.nextInt();
		            int i=1;
		
	             	while(i<=ecount)
		              {
			            System.out.println("Enter Employee "+i+" Details ");
			            System.out.println("Enter the Firstname ");
			            String sname=s.next();
			            System.out.println("Enter the Lastname ");
			            String lname=s.next();
			            System.out.println("Enter the Mobile ");
			            String mob=s.next();
			            System.out.println("Enter the Email ");
			            String email=s.next();
			            System.out.println("Enter the Address ");
			            String add=s.next();
			            i++;
			            emp=new Employee(sname,lname,mob,email,add);
			            list.add(emp);

			
		              }
		               System.out.println();
		                if(ecount>=1)
		                {
		                    System.out.println("Employee List: ");
		                    System.out.format("%-15s %-15s %-15s %-30s %-15s\n","FirstName","SecondName","MobileNumber","Email","Address");
		                    //Collections.sort(list); 
 		                    for(Iterator<Employee> itr=list.iterator();itr.hasNext();)
                                 {
	       
	       //System.out.println(ghy);
        	                         itr.next().m();
	       
                                  }
		
                        }
               }
              catch(Exception e)
              {
 
              }

	}
}