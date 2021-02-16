import java.util.*;
 public class Collection6
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s1="";
	 String s2="";
	 System.out.println("Enter the First String  : ");
	 String p1=sc.next();
	 System.out.println("Entre the Second String : ");
	 String p2=sc.next();
	 if(p1.length()>=p2.length())
	 {
	 	s1=s1+p1;
	 	s2=s2+p2;
	 }
	 else
	 {
         s1=s1+p2;
         s2=s2+p1;
	 }
	 List<String> list=doOperation(s1,s2);
	 System.out.println("Output : "+ list);




		}
		public static List<String> doOperation(String s1,String s2)
		{
			List<String> list=new ArrayList<String>();
			StringBuilder sb=new StringBuilder();
			for(int i=1;i<s1.length();i=i+2)
			{
				sb.append(s2);
				sb.append(s1.charAt(i));
			}
			list.add(sb.toString());
			int occ=s1.split(s2,-1).length-1;
			if(occ>1)
			{
				list.add(s1.substring(0,s1.lastIndexOf(s2)) + new StringBuilder(s2).reverse());
			}
			if(occ>1)
			{
				list.add(s1.substring(0,s1.indexOf(s2)) + s1.substring(s1.indexOf(s2) + s2.length(),s1.length()));
			}
			int part=s2.length()%2==0?s2.length()/2:s2.length()/2+1;
			list.add(s2.substring(0,part) + s1 + s2.substring(part,s2.length()));
			sb=new StringBuilder();
			for(int i=0;i<s1.length();i++)
			{
				if(s2.indexOf(s1.charAt(i))!=-1)
				{
					sb.append('*');
				}
				else
				{
					sb.append(s1.charAt(i));
				}
			}
    list.add(sb.toString());
    return list;

		}
	}