import java.util.*;
class Employee
{
	String empName;
	int empId;
	String email;
	String gender;
	float salary;
	public void GetEmployeeDetails()
	{
             System.out.println(empName+"       "+empId+"   "+email+"    "+gender+"    "+salary);
	}
	Employee(String empName,int empId,String email,String gender,float salary)
	{
		this.empName=empName;
		this.empId=empId;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}
         



}
public class EmployeeDB
{
	static ArrayList<Employee> list=new ArrayList<Employee>();
	 public static boolean addEmployee(Employee e)
	 {
	 	
         list.add(e);
        return true;
	 }
	 public static boolean deleteEmployee(int empI)
	 {
	 	       //boolean hj=false;
	 	try{
	 	       	for (Iterator<Employee> it = list.iterator(); it.hasNext(); )
	 	       	 {
                   

                   int k=it.next().empId;
                   if(k==empI)
                   {
                   	it.remove();
            //       	hj=true;
                   }
                 }
                 
             }
             catch(Exception e)
             {
             	System.out.println("No such Element found with given Employee Id  "+empI);
             }

		
            return true;
	 }
	 public static String showPaySlip(int empId)
	 {

             String p="";
             try{
	 	       	for (Iterator<Employee> it1 = list.iterator(); it1.hasNext(); )
	 	       	 {
                  

                   int k=it1.next().empId;
                   if(k==empId)
                   {
                   
                    p=p+"Employee name = "+it1.next().empName+"  EmployeeId  =  "+it1.next().empId+"  Email = "+it1.next().email+"  Gender  "+it1.next().gender+"   Salary   "+it1.next().salary+" ";

                      break;
                       }
                 }
             }
             catch(Exception e)
             {
             	System.out.println("No Suitable employee Found :");
             }
                 return p;
             
	 }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int empcount=0;
		String empName="";
		int empId=0;
		String email="";
		String gender="";
		float salary=0.0f;
		boolean df=true;
		while(df)
		{
		try{
		System.out.println("Please Enter Number of Employee : ");
		empcount=sc.nextInt();
		}
       catch(Exception e)
       {
       	System.out.println("Please enter Valid Input : Thank You ");
       	System.exit(0);
       }
		for(int i=0;i<empcount;i++)
		{
           System.out.println("Please enter the Employee name :");
           empName=sc.next();
       
           try{
           System.out.println("Please enter the employee Id : ");
           empId=sc.nextInt();
             }
             catch(Exception e)
             {
             	System.out.println("Emloyee Id should be in Integer ");
             }

           System.out.println("Please enter the employee email : ");
           email=sc.next();
           System.out.println("Please enter the employee gender : ");
           gender=sc.next();
           System.out.println("Please enter the employee salary : ");
           try{
           salary=sc.nextFloat();
           if(salary<0)
           {
           	System.out.println("Salary should not be negative : ");
           	System.exit(0);
           }
       }
       catch(Exception e)
       {
       	System.out.println("Salary should be in Decimal : ");
       }
           
           Employee emp = new Employee(empName,empId,email,gender,salary);
           addEmployee(emp);
           		
     	}
     	System.out.println("****** Total Employee********");
     		for (Iterator<Employee> it = list.iterator(); it.hasNext(); ) {
                it.next().GetEmployeeDetails();
            }
            System.out.println("*************************************************************");
		System.out.println("enter the EmployeeId do you want to be deleted  :  ");
        int sd=0;
        try{
        sd=sc.nextInt();
          }
          catch(Exception e)
          {
          	System.out.println("EmployeeId should be in Integer : ");
          	System.exit(0);
          }

     	deleteEmployee(sd);
        System.out.println("*******************************************************************");
        System.out.println("Enter the EmployeeId for printing PaySlip ");
        int sbdi=0;
        try{      
        sbdi=sc.nextInt();
           }
           catch(Exception e)
           {
           	System.out.println(" Provide Valid Input : ");
           	System.exit(0);
           }
           if(showPaySlip(sbdi).equals(""))
           {
           	System.out.println("Not suitable employee Found : ");
           }
           else
           {
     	   System.out.println("payslip of the employee  "+showPaySlip(sbdi ));
     	     }
           System.out.println("********** Total Employees ********** ");
        
		for (Iterator<Employee> it = list.iterator(); it.hasNext(); ) {
                it.next().GetEmployeeDetails();
            }
		System.out.println("Please Elect Valid Input : ");
		System.out.println(" press 1: for Again ");
		System.out.println(" or press anything for exiting Application : ");
		String er=sc.next();
		if(er.equals("1"))
		{
			df=true;
		}
		else
		{
			df=false;
			System.out.println("Thank You For Using This Application :");
			System.exit(0);
		}

	}
}
