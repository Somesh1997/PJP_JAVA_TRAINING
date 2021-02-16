import java.util.*;
class M
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String p=sc.nextLine();
		ArrayList<String> list=new ArrayList<String>();
		int j=0;
		try{
		for(int i=0;i<p.length();i++)
		{
              if(p.charAt(i)==' ')
              {
              	
              	list.add(p.substring(j,i));
              	j=i+1;
              }
              
		}
		for(int i=p.length()-1;i>0;i--)
		{
			if(p.charAt(i)==' ')
			{
				String mn=p.substring(i+1,p.length());
				list.add(mn);
				break;
			}
		}
		   StringBuffer sb=new StringBuffer(p);
		   System.out.println(sb);
		   sb.reverse();
		   System.out.println(sb);
		   boolean s=false;
		   int q=0;
		   ArrayList<String> list1=new ArrayList<>();
		   int counter=0;
           for(int i=0;i<sb.length();i++)
           {  
                     if(sb.charAt(i)==' ')
                     {
                     	  counter++;
                     	  String pm="";
                     	  for(;q<i;q++) 
                     	  { 
                     	  	  pm=pm+""+sb.charAt(q)+"";
                     	  } 
     
                          list1.add(pm); 
                     	   
                     	  i=q; 
                     	  q=i+1; 
                     } 
  
                   

           }
          
           for(int i=sb.length()-1;i>0;i--)
		{
			if(sb.charAt(i)==' ')
			{
				String mn=sb.substring(i+1,sb.length());
				list1.add(mn);
				break;
			}
		}
           System.out.println(list1);
         int flag1=0;
        for(int i=0;i<list1.size();i++)
        {
        	for(int h=0;h<list.size();h++)
        	{
        		if(list1.get(i).equals(list.get(h)))
        		{
        			if(list1.get(i).length()==1 || list.get(h).length()==1)
        			{
        				continue;
        			}
        			flag1=1;
        			break;
        		}
        	}
        }
       if(flag1==1)
        {
        	System.out.println("Present");
        }
        else
        {
        	System.out.println("Not Present ");
        }
    }
    catch(Exception e)
    {

    }

		System.out.println(list);


	}
}