import java.util.*;
class Employee
{
	String empName;
	int empId;
	
	public void GetEmployeeDetails()
	{
             System.out.println(empName+"     "+empId+"   ");
	}
	Employee(String empName,int empId)
	{
		this.empName=empName;
		this.empId=empId;
		
	}

}
public class List7
{


	public static void main(String[] args) 
		{
           Vector<Employee> v=new Vector<>();
                  System.out.println("Name         ID ");
           Employee emp=new Employee("somesh   ",1);
          Employee emp2=new Employee("vaibhav  ",3);
           Employee emp3=new Employee("sant     ",7);
           v.add(emp);
           v.add(emp2);
           v.add(emp3);
            for (Iterator<Employee> it = v.iterator(); it.hasNext(); ) {
                it.next().GetEmployeeDetails();
            }

		}
	
}