class Employee extends Person
{
public double salary;
public String year;
public String nationalInsuranceNumber;
public Person person;
public Employee(double salary,Person person,String year,String nationalInsuranceNumber)
{
    this.person=person;
	this.salary=salary;
	this.year=year;
	this.nationalInsuranceNumber=nationalInsuranceNumber;
}
public void setSalary(double salary)
{
	this.salary=salary;
}
public void setYear(String year)
{
	this.year=year;
}
public void setNationalInsuranceNumber(String nationalInsuranceNumber)
{
	this.nationalInsuranceNumber=nationalInsuranceNumber;
}
public String toString()
{
	return "salary is "+salary+ " year is    "  +year+"  nationalInsuranceNumber  is  "+nationalInsuranceNumber+"  name is  "+person;
}

}