import java.util.*;
abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice()
	{
return "This is FirstClass Coach";
	}
}
class Ladies extends Compartment{
	public String notice()
	{
return "This is Ladies Coach";
	}
}
class General extends Compartment{
	public String notice(){
return "This is General Coach";
	}
}
class Luggage extends Compartment{
	public String notice()
	{
return "This is Luggage Coach";
	}
}






public class TestCompartment
{
	public static void main(String[] args) {
		
		Compartment comp[]=new Compartment[10];
		Random rmd=new Random();
		int num=0;
          for(int i=0;i<10;i++)
          {
          	num=rmd.nextInt(4);
          	if(num==0)
          	{
          		comp[i]=new FirstClass();
          	}
          	else if(num==1)
          		{
                comp[i]=new Ladies();
          		}
          		else if(num==2)
          		{
          			comp[i]=new General();
          		}
          		else
          		{
          			comp[i]=new Luggage();
          		}
          	
           System.out.println(comp[i].notice());
           System.out.println();

          }

	}
}