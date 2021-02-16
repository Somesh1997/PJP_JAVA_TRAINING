import java.util.Scanner;
public class TestEmployee
{
	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name : ");
       String name=sc.next();
       Person person=new Person(name);
       person.setName(name);
       System.out.println("Enter the salary : ");
       double salary=sc.nextDouble();
       System.out.println("Enter the Year : ");
       String year=sc.next();
       System.out.println("Enter the nationalInsuranceNumber ");
       String nationalInsuranceNumber=sc.next();
       Employee emp=new Employee(salary,person,year,nationalInsuranceNumber);
       emp.setSalary(salary);
       emp.setYear(year);
       emp.setNationalInsuranceNumber(nationalInsuranceNumber);
       System.out.println(emp);



	}
}