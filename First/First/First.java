import java.util.*;
class Student
{
	public String name;
	public int marks[]=new int[3];
	Student(String name,int marks[])
	{
		try{
		this.name=name;

		for(int i=0;i<3;i++)
		{
		if(marks==null)
		{
			this.marks=null;
			break;
		}
		 this.marks[i]=marks[i];
		}
	}
	catch(Exception e)
	{

	}
	}

}
class NullMarksArrayException extends Exception
{
	public String toString()
	{
		return "NullMarksArrayException occured";
	}
}
class NullNameException extends Exception
{
	public String toString()
	{
		return "NullNameException occured ";
	}
}
class NullStudentException extends Exception
{
	public String toString()
	{
		return "NullStudentException occured ";
	}
}
class StudentReport 
{
	public String findGrade(Student sobj)
	{
		String l="";
		int sum=0;
          for(int i=0;i<sobj.marks.length;i++)
          {
          	if(sobj.marks[i]<35)
          	{
              l="F";
              break;
          	}
          	else
          	{
               sum=sum+sobj.marks[i];
          	}
          }
      if(sum<=150)
      {
      	l="D";
      }
      if(sum>150 && sum <=200)
      {
      	l="C";
      }
      if(sum>200 && sum <=250)
      {
      	l="B";
      }
      if(sum>250 && sum<=300)
      {
      	l="A";
      }
   return l;
	}
	public String validate(Student sobj1) throws NullStudentException,NullNameException,NullMarksArrayException
	{
		//int k=0;
           if(sobj1==null)
           {

           	throw (new NullStudentException());
           }
           if(sobj1.name==null)
           {
           	throw (new NullNameException());
           }
           	//System.out.println(sobj1.marks);
           if((sobj1.marks)==null)
           {
           	//System.out.println(sobj1.marks);
           	throw (new NullMarksArrayException());

           }
           String p=findGrade(sobj1);
           return(p);
	}

}
class StudentService
{

public int findNumberOfNullMarks(Student obj[])
{
	if(obj==null)
	{
		return 0;
	}
	int counter=0;
	try{
	for(int i=0;i<obj.length;i++)
	{
		if((obj[i].marks)==null)
		{
			counter++;
		}
	}
	}
	catch(NullPointerException e)
	{

		
	}
	return counter;

}
public int findNumberOfNullNames(Student obj[])
{
int counter=0;
if(obj==null)
{
	return counter;
}
try{
for(int i=0;i<obj.length;i++)
{
	if(obj[i].name==null)
	{
		counter++;
	}
   }
}
catch(Exception e)
     {

     }
     return counter;
}
public int findNumberOfNullObjects(Student obj[])
{
int counter=0;
try{
for(int i=0;i<obj.length;i++)
{
	if(obj[i] == null)
	{
		counter++;
	}
}
}
catch(Exception e)
{

}



return counter;
}







}
public class First
{
	static Student data[]=new Student[4];
	static{

data[0]=new Student("sekar",new int[]{35,35,35});
data[1]=new Student(null,new int[]{11,22,33});
data[2]=null;
data[3]=new Student("Manoj",null);



	}
	public static void main(String[] args) {
		StudentService studentservice=new StudentService();
		StudentReport studentreport=new StudentReport();
		System.out.println("Grades Calculation ");
		String x=null;
		for(int i=0;i<data.length;i++)
		{
			try
			{
				x=studentreport.validate(data[i]);
			}
			catch(NullNameException e)
			{
               x="NullNameException occured ";
			}
			catch(NullMarksArrayException e)
			{
				x="NullMarksArrayException occured ";
			}		
			catch(NullStudentException e)
			{
				x="NullStudentException occured ";
			}
			System.out.println("GRADE="+x);
		
	}
	System.out.println("Number of Object With Marks Array as Null "+studentservice.findNumberOfNullMarks(data));
	System.out.println("Number of Object With name as Null "+studentservice.findNumberOfNullNames(data));
	System.out.println("Number of Object that are entirely Null "+studentservice.findNumberOfNullObjects(data));

}
}