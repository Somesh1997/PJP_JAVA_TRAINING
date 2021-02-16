import java.util.*;
class NJ
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,21,17,19,22,43,78,65,67,68,98,100,112,113,180};
		ArrayList<ArrayList<Integer>> s=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			list=new ArrayList<Integer>();
			list.add(a[i]);
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					
					break;
				}
				if(a[i]+4>=a[j])
				{
                      list.add(a[j]);
				}
				else
				{
					
					break;
				}
			}
			System.out.println(list);
			i=j-1;
			s.add(list);
		}

		System.out.println(s.size());
		System.out.println(s);
	}
}