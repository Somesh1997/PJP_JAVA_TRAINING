import java.util.*;
class MyComprator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		double s1=((Box)(obj1)).volume;
		double s2=((Box)(obj2)).volume;
		int m=0;
		if(s1==s2){
          m=0;
		}
	     if(s1>s2)
	     m=100;
	     if(s1<s2)
	     	m=-1;
	     return(m);
	}
}
public class Box
{
	public double length;
	public double width;
	public double height;
	public double volume;
	Box(double length,double width,double height,double volume)
	{
      this.length=length;
      this.width=width;
      this.height=height;
      this.volume=volume;
	}
	public void disp()
	{
			
          	System.out.println("Length = "+length+" Width = "+width+" Height = "+height+" Volume = "+volume);
	}
	public static void main(String[] args) {
		TreeSet<Box> bx=new TreeSet<Box>(new MyComprator());
        Scanner sc=new Scanner(System.in);
        int count=0;
        double length=0.0;
        double width=0.0;
        double height=0.0;
        double volume=0.0;
        int i=1;
        System.out.println("Enter the number of Box ");
         try
         {
               count=sc.nextInt();
             // boolean mn=true;
              
             while(i<=count)
          {
             System.out.println("Enter the Box "+i+" details ");
             System.out.println("Enter Length ");
             length=sc.nextDouble();
             System.out.println("Enter Width ");     
             width=sc.nextDouble();
             System.out.println("Enter Height ");
             height=sc.nextDouble();
              volume=length*width*height;
             Box box=new Box(length,width,height,volume);
                       bx.add(box);                                                                   
             i++; 

          }
          System.out.println(bx.size());
          }       
         catch(Exception e)
          {
            	System.out.println("provide valid input : ");
          }
          System.out.println("Unique Boxes in the Set are ");

          for(Iterator<Box> it=bx.iterator();it.hasNext();)
          {
          	it.next().disp();
          }

         

         
      {

      }

	}
}