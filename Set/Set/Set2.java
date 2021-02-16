import java.util.*;
class Employee
{
String ename;
Employee(String ename)
{
	this.ename=ename;
}
}
public class Set2
{
	public static void main(String[] args) {
		HashSet<Employee> s=new HashSet<Employee>();
		 Scanner sc=new Scanner(System.in);
		 boolean n=true;
		 while(n)
		 {
		 	try{
		 	System.out.println("Please enter valid input : ");
		 	System.out.println("1. for adding employee name in to HashSet : ");
		 	System.out.println("2. for retriving employee name from HashSet : ");
		 	System.out.println("3. Exiting : ");
		 		int x=sc.nextInt();
		 	if(x==1)
		 	{ System.out.println("Enter the Employee Name :");
		 		String p=sc.next();
		 		s.add(new Employee(p));
		 		System.out.println("Employee added Succssfully : ");
		 		continue;
		 	}
		 
              if(x==2)
              {
              	for (Iterator<Employee> it1 = s.iterator(); it1.hasNext(); )
	 	       	 {
                  try{
                    String k=it1.next().ename;
                   System.out.println(k); 
                   
                }
                catch(Exception e)
                {
                      System.out.println("HashSet is Empty : ");
                }
                  
                 }
                 continue;
              }
              else
              {
              	System.out.println("Thank You For Using This Application :  ");
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
